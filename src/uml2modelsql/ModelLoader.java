package uml2modelsql;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.*;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelLoader {

    public ModelLoader() {
        // Registra a fábrica de recursos para arquivos .ecore e .xmi
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        reg.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
        reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
    }

    public EPackage loadMetamodel(String ecorePath) {
        ResourceSet rs = new ResourceSetImpl();
        Resource res = rs.getResource(URI.createFileURI(new File(ecorePath).getAbsolutePath()), true);
        return (EPackage) res.getContents().get(0);
    }

    public EObject loadModel(String ecorePath, String modelPath) {
        // Carrega o metamodelo para registrar os tipos
        loadMetamodel(ecorePath);
        ResourceSet rs = new ResourceSetImpl();
        Resource res = rs.getResource(URI.createFileURI(new File(modelPath).getAbsolutePath()), true);
        return res.getContents().get(0);
    }

    public void saveModel(EObject root, EPackage metamodel, String outputPath) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        // Registra o metamodelo no ResourceSet
        rs.getPackageRegistry().put(metamodel.getNsURI(), metamodel);
        Resource res = rs.createResource(URI.createFileURI(new File(outputPath).getAbsolutePath()));
        res.getContents().add(root);
        res.save(null);
    }
}
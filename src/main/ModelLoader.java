package main;

import org.eclipse.emf.ecore.resource.*;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.util.Map;

import sql.SqlPackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

public class ModelLoader {
    public static EObject load(String path) {
    	
    	// REGISTRA O METAMODELO!
        SqlPackage.eINSTANCE.eClass();

        // Registra uma factory para arquivos .sql
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("sql", new XMIResourceFactoryImpl());

        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(
            org.eclipse.emf.common.util.URI.createFileURI(path), true);
        return resource.getContents().get(0);
    }
}

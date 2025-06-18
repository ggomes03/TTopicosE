/**
 */
package entidades;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacionamento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entidades.Relacionamento#getNome <em>Nome</em>}</li>
 *   <li>{@link entidades.Relacionamento#getOrigem <em>Origem</em>}</li>
 *   <li>{@link entidades.Relacionamento#getDestino <em>Destino</em>}</li>
 *   <li>{@link entidades.Relacionamento#getMultiplicidadeOrigem <em>Multiplicidade Origem</em>}</li>
 *   <li>{@link entidades.Relacionamento#getMultiplicidadeDestino <em>Multiplicidade Destino</em>}</li>
 * </ul>
 *
 * @see entidades.UmlPackage#getRelacionamento()
 * @model
 * @generated
 */
public interface Relacionamento extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see entidades.UmlPackage#getRelacionamento_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link entidades.Relacionamento#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Origem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origem</em>' reference.
	 * @see #setOrigem(Entidade)
	 * @see entidades.UmlPackage#getRelacionamento_Origem()
	 * @model
	 * @generated
	 */
	Entidade getOrigem();

	/**
	 * Sets the value of the '{@link entidades.Relacionamento#getOrigem <em>Origem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origem</em>' reference.
	 * @see #getOrigem()
	 * @generated
	 */
	void setOrigem(Entidade value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Entidade)
	 * @see entidades.UmlPackage#getRelacionamento_Destino()
	 * @model
	 * @generated
	 */
	Entidade getDestino();

	/**
	 * Sets the value of the '{@link entidades.Relacionamento#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Entidade value);

	/**
	 * Returns the value of the '<em><b>Multiplicidade Origem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidade Origem</em>' attribute.
	 * @see #setMultiplicidadeOrigem(String)
	 * @see entidades.UmlPackage#getRelacionamento_MultiplicidadeOrigem()
	 * @model
	 * @generated
	 */
	String getMultiplicidadeOrigem();

	/**
	 * Sets the value of the '{@link entidades.Relacionamento#getMultiplicidadeOrigem <em>Multiplicidade Origem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidade Origem</em>' attribute.
	 * @see #getMultiplicidadeOrigem()
	 * @generated
	 */
	void setMultiplicidadeOrigem(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidade Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidade Destino</em>' attribute.
	 * @see #setMultiplicidadeDestino(String)
	 * @see entidades.UmlPackage#getRelacionamento_MultiplicidadeDestino()
	 * @model
	 * @generated
	 */
	String getMultiplicidadeDestino();

	/**
	 * Sets the value of the '{@link entidades.Relacionamento#getMultiplicidadeDestino <em>Multiplicidade Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidade Destino</em>' attribute.
	 * @see #getMultiplicidadeDestino()
	 * @generated
	 */
	void setMultiplicidadeDestino(String value);

} // Relacionamento

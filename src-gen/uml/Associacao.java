/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.Associacao#getNome <em>Nome</em>}</li>
 *   <li>{@link uml.Associacao#isEhChaveEstrangeira <em>Eh Chave Estrangeira</em>}</li>
 *   <li>{@link uml.Associacao#getTabelaOrigem <em>Tabela Origem</em>}</li>
 *   <li>{@link uml.Associacao#getTabelaAlvo <em>Tabela Alvo</em>}</li>
 * </ul>
 *
 * @see uml.UmlPackage#getAssociacao()
 * @model
 * @generated
 */
public interface Associacao extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see uml.UmlPackage#getAssociacao_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link uml.Associacao#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Eh Chave Estrangeira</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eh Chave Estrangeira</em>' attribute.
	 * @see #setEhChaveEstrangeira(boolean)
	 * @see uml.UmlPackage#getAssociacao_EhChaveEstrangeira()
	 * @model
	 * @generated
	 */
	boolean isEhChaveEstrangeira();

	/**
	 * Sets the value of the '{@link uml.Associacao#isEhChaveEstrangeira <em>Eh Chave Estrangeira</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eh Chave Estrangeira</em>' attribute.
	 * @see #isEhChaveEstrangeira()
	 * @generated
	 */
	void setEhChaveEstrangeira(boolean value);

	/**
	 * Returns the value of the '<em><b>Tabela Origem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabela Origem</em>' reference.
	 * @see #setTabelaOrigem(Classe)
	 * @see uml.UmlPackage#getAssociacao_TabelaOrigem()
	 * @model
	 * @generated
	 */
	Classe getTabelaOrigem();

	/**
	 * Sets the value of the '{@link uml.Associacao#getTabelaOrigem <em>Tabela Origem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabela Origem</em>' reference.
	 * @see #getTabelaOrigem()
	 * @generated
	 */
	void setTabelaOrigem(Classe value);

	/**
	 * Returns the value of the '<em><b>Tabela Alvo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabela Alvo</em>' reference.
	 * @see #setTabelaAlvo(Classe)
	 * @see uml.UmlPackage#getAssociacao_TabelaAlvo()
	 * @model
	 * @generated
	 */
	Classe getTabelaAlvo();

	/**
	 * Sets the value of the '{@link uml.Associacao#getTabelaAlvo <em>Tabela Alvo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabela Alvo</em>' reference.
	 * @see #getTabelaAlvo()
	 * @generated
	 */
	void setTabelaAlvo(Classe value);

} // Associacao

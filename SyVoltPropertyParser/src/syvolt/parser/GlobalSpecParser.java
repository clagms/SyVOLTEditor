package syvolt.parser;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import syvolt.Expression;
import syvolt.GlobalSpecification;
import syvolt.SyvoltPackage;
import syvolt.TransformationModel;

public class GlobalSpecParser {

	public static void createGlobalSpecAST(TransformationModel element) {
		System.out.println("Creating AST from TransformationModel...");
		
		element.getSpecification().setAbstractValue(createGlobalSpecAST(element.getSpecification(),element.getSpecification().getValue()));;
		
		System.out.println("Creating AST from TransformationModel... DONE");
	}
	
	public static Expression createGlobalSpecAST(GlobalSpecification element, String newString) {
		System.out.println("Creating AST from GlobalSpec string...");
		
		Expression result = null;
		
		// TODO create AST from string expression.
		
		System.out.println("Creating AST from GlobalSpec string... DONE");
		return result;
	}

	public static void main(String[] args) {
		String path = "testModel/communityPerson.syvolt";
		TransformationModel model = load(path);
		createGlobalSpecAST(model);
		store(model, path);
	}

	public static TransformationModel load(String path) {

		System.out.println("Loading syvolt property...");

		System.out.println("path: " + path);

		SyvoltPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("syvolt", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		System.out.println("path URI: " + URI.createURI(path));

		Resource resource = resSet.getResource(URI.createURI(path), true);

		TransformationModel rootEClass = (TransformationModel) resource
				.getContents().get(0);

		System.out.println("model loaded: " + rootEClass);

		System.out.println("Loading syvolt property... DONE");

		return rootEClass;
	}

	public static void store(TransformationModel element, String path) {
		System.out.println("Storing syvolt property...");

		System.out.println("model: " + element);

		System.out.println("path: " + path);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		System.out.println("path URI: " + URI.createURI(path));

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(path));

		resource.getContents().add(element);

		try {
			resource.save(Collections.EMPTY_MAP);

			System.out.println("Storing syvolt property... DONE");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

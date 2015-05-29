package syvolt.parser;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import syvolt.Expression;
import syvolt.GlobalSpecification;
import syvolt.Implies;
import syvolt.SyvoltFactory;
import syvolt.SyvoltPackage;
import syvolt.diagram.parsers.MessageFormatParser;

public class DiagramGlobalSpecParser extends MessageFormatParser {

	public DiagramGlobalSpecParser(EAttribute[] features) {
		super(features);
	}

	@Override
	public ICommand getParseCommand(IAdaptable adapter, String newString,
			int flags) {
		ICommand attributeParseCommand = super.getParseCommand(adapter,
				newString, flags);

		EObject element = (EObject) adapter.getAdapter(EObject.class);

		if (attributeParseCommand instanceof CompositeTransactionalCommand
				&& element instanceof GlobalSpecification) {

			GlobalSpecification globalSpecBeingEdited = (GlobalSpecification) element;

			CompositeTransactionalCommand compoundCommand = (CompositeTransactionalCommand) attributeParseCommand;
			createParseASTCommand(compoundCommand, globalSpecBeingEdited,
					newString);

			return compoundCommand;
		}

		return attributeParseCommand;
	}

	private void createParseASTCommand(
			CompositeTransactionalCommand compoundCommand,
			GlobalSpecification globalSpecBeingEdited, String newString) {

		EReference refToChange = SyvoltPackage.eINSTANCE.getGlobalSpecification_AbstractValue();

		Expression ast = GlobalSpecParser.createGlobalSpecAST(globalSpecBeingEdited, newString);
		
		SetRequest request = new SetRequest(globalSpecBeingEdited, refToChange, ast);
		
		// TODO Enable to parse the string into an AST.
		//compoundCommand.compose(new SetValueCommand(request));
		
	}

}

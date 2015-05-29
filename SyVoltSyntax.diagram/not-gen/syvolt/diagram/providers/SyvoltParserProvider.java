/*
 * 
 */
package syvolt.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import syvolt.SyvoltPackage;
import syvolt.diagram.edit.parts.AnyMatchClassClassNameEditPart;
import syvolt.diagram.edit.parts.ApplyAssociationAssociationNameEditPart;
import syvolt.diagram.edit.parts.ApplyAttributeAttributeNameEditPart;
import syvolt.diagram.edit.parts.ApplyClassClassNameEditPart;
import syvolt.diagram.edit.parts.ApplySameElementsAssociationNameEditPart;
import syvolt.diagram.edit.parts.AtomValue2EditPart;
import syvolt.diagram.edit.parts.AtomValue3EditPart;
import syvolt.diagram.edit.parts.AtomValue4EditPart;
import syvolt.diagram.edit.parts.AtomValueEditPart;
import syvolt.diagram.edit.parts.AtomicContractNameEditPart;
import syvolt.diagram.edit.parts.ExistsMatchClassClassNameEditPart;
import syvolt.diagram.edit.parts.GlobalSpecificationValueEditPart;
import syvolt.diagram.edit.parts.IsNullValueEditPart;
import syvolt.diagram.edit.parts.MatchAttributeAttributeNameEditPart;
import syvolt.diagram.edit.parts.MatchSameElementsAssociationNameEditPart;
import syvolt.diagram.edit.parts.NegativeIndirectAssociationAssociationNameEditPart;
import syvolt.diagram.edit.parts.PositiveMatchAssociationAssociationNameEditPart;
import syvolt.diagram.parsers.MessageFormatParser;
import syvolt.diagram.part.SyvoltVisualIDRegistry;
import syvolt.parser.DiagramGlobalSpecParser;

/**
 * @generated
 */
public class SyvoltParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser atomicContractName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicContractName_5019Parser() {
		if (atomicContractName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAtomicContract_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomicContractName_5019Parser = parser;
		}
		return atomicContractName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser globalSpecificationValue_5017Parser;

	/**
	 * @generated
	 */
	private IParser getGlobalSpecificationValue_5017Parser() {
		if (globalSpecificationValue_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getGlobalSpecification_Value() };
			DiagramGlobalSpecParser parser = new DiagramGlobalSpecParser(features);
			globalSpecificationValue_5017Parser = parser;
		}
		return globalSpecificationValue_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser anyMatchClassClassName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getAnyMatchClassClassName_5014Parser() {
		if (anyMatchClassClassName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAbstractClass_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anyMatchClassClassName_5014Parser = parser;
		}
		return anyMatchClassClassName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser matchAttributeAttributeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMatchAttributeAttributeName_5003Parser() {
		if (matchAttributeAttributeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAttribute_AttributeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			matchAttributeAttributeName_5003Parser = parser;
		}
		return matchAttributeAttributeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomValue_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAtomValue_5001Parser() {
		if (atomValue_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAtom_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomValue_5001Parser = parser;
		}
		return atomValue_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser isNullValue_5002Parser;

	/**
	 * @generated
	 */
	private IParser getIsNullValue_5002Parser() {
		if (isNullValue_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getisNull_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			isNullValue_5002Parser = parser;
		}
		return isNullValue_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser existsMatchClassClassName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getExistsMatchClassClassName_5015Parser() {
		if (existsMatchClassClassName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAbstractClass_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			existsMatchClassClassName_5015Parser = parser;
		}
		return existsMatchClassClassName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser applyClassClassName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getApplyClassClassName_5016Parser() {
		if (applyClassClassName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAbstractClass_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applyClassClassName_5016Parser = parser;
		}
		return applyClassClassName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser applyAttributeAttributeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getApplyAttributeAttributeName_5010Parser() {
		if (applyAttributeAttributeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAttribute_AttributeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applyAttributeAttributeName_5010Parser = parser;
		}
		return applyAttributeAttributeName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomValue_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAtomValue_5007Parser() {
		if (atomValue_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAtom_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomValue_5007Parser = parser;
		}
		return atomValue_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomValue_5008Parser;

	/**
	 * @generated
	 */
	private IParser getAtomValue_5008Parser() {
		if (atomValue_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAtom_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomValue_5008Parser = parser;
		}
		return atomValue_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomValue_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAtomValue_5009Parser() {
		if (atomValue_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAtom_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomValue_5009Parser = parser;
		}
		return atomValue_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser negativeIndirectAssociationAssociationName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getNegativeIndirectAssociationAssociationName_6001Parser() {
		if (negativeIndirectAssociationAssociationName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			negativeIndirectAssociationAssociationName_6001Parser = parser;
		}
		return negativeIndirectAssociationAssociationName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser positiveMatchAssociationAssociationName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getPositiveMatchAssociationAssociationName_6002Parser() {
		if (positiveMatchAssociationAssociationName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			positiveMatchAssociationAssociationName_6002Parser = parser;
		}
		return positiveMatchAssociationAssociationName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser matchSameElementsAssociationName_6008Parser;

	/**
	 * @generated
	 */
	private IParser getMatchSameElementsAssociationName_6008Parser() {
		if (matchSameElementsAssociationName_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			matchSameElementsAssociationName_6008Parser = parser;
		}
		return matchSameElementsAssociationName_6008Parser;
	}

	/**
	 * @generated
	 */
	private IParser applySameElementsAssociationName_6009Parser;

	/**
	 * @generated
	 */
	private IParser getApplySameElementsAssociationName_6009Parser() {
		if (applySameElementsAssociationName_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applySameElementsAssociationName_6009Parser = parser;
		}
		return applySameElementsAssociationName_6009Parser;
	}

	/**
	 * @generated
	 */
	private IParser applyAssociationAssociationName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getApplyAssociationAssociationName_6004Parser() {
		if (applyAssociationAssociationName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { SyvoltPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applyAssociationAssociationName_6004Parser = parser;
		}
		return applyAssociationAssociationName_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case AtomicContractNameEditPart.VISUAL_ID:
			return getAtomicContractName_5019Parser();
		case GlobalSpecificationValueEditPart.VISUAL_ID:
			return getGlobalSpecificationValue_5017Parser();
		case AnyMatchClassClassNameEditPart.VISUAL_ID:
			return getAnyMatchClassClassName_5014Parser();
		case MatchAttributeAttributeNameEditPart.VISUAL_ID:
			return getMatchAttributeAttributeName_5003Parser();
		case AtomValueEditPart.VISUAL_ID:
			return getAtomValue_5001Parser();
		case IsNullValueEditPart.VISUAL_ID:
			return getIsNullValue_5002Parser();
		case ExistsMatchClassClassNameEditPart.VISUAL_ID:
			return getExistsMatchClassClassName_5015Parser();
		case ApplyClassClassNameEditPart.VISUAL_ID:
			return getApplyClassClassName_5016Parser();
		case ApplyAttributeAttributeNameEditPart.VISUAL_ID:
			return getApplyAttributeAttributeName_5010Parser();
		case AtomValue2EditPart.VISUAL_ID:
			return getAtomValue_5007Parser();
		case AtomValue3EditPart.VISUAL_ID:
			return getAtomValue_5008Parser();
		case AtomValue4EditPart.VISUAL_ID:
			return getAtomValue_5009Parser();
		case NegativeIndirectAssociationAssociationNameEditPart.VISUAL_ID:
			return getNegativeIndirectAssociationAssociationName_6001Parser();
		case PositiveMatchAssociationAssociationNameEditPart.VISUAL_ID:
			return getPositiveMatchAssociationAssociationName_6002Parser();
		case MatchSameElementsAssociationNameEditPart.VISUAL_ID:
			return getMatchSameElementsAssociationName_6008Parser();
		case ApplySameElementsAssociationNameEditPart.VISUAL_ID:
			return getApplySameElementsAssociationName_6009Parser();
		case ApplyAssociationAssociationNameEditPart.VISUAL_ID:
			return getApplyAssociationAssociationName_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SyvoltVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SyvoltVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SyvoltElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

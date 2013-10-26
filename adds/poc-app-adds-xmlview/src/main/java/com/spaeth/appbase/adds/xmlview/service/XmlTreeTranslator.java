package com.spaeth.appbase.adds.xmlview.service;

import static com.spaeth.appbase.adds.xmlview.service.XmlViewTranslatorConstants.CAPTION_PROPERTY_ATTRIBUTE_NAME;
import static com.spaeth.appbase.adds.xmlview.service.XmlViewTranslatorConstants.PARENT_PROPERTY_ATTRIBUTE_NAME;
import static com.spaeth.appbase.adds.xmlview.service.XmlViewTranslatorHelper.aggregateCollectionViewerComponentProperties;
import static com.spaeth.appbase.adds.xmlview.service.XmlViewTranslatorHelper.aggregateFieldComponentProperties;
import static com.spaeth.appbase.adds.xmlview.service.XmlViewTranslatorHelper.readAttribute;

import org.w3c.dom.Element;

import com.spaeth.appbase.adds.xmlview.XmlViewContext;
import com.spaeth.appbase.component.Tree;
import com.spaeth.appbase.service.I18NSupport;

public class XmlTreeTranslator extends AbstractXmlVisualComponentTranslator<Tree> {

	private final I18NSupport i18nSupport;

	public XmlTreeTranslator(final FrontXmlTranslator frontXmlTranslator, final I18NSupport i18nSupport) {
		super(frontXmlTranslator);
		this.i18nSupport = i18nSupport;
	}

	@Override
	protected Tree createResult(final Element source, final XmlViewContext context) {
		return new Tree();
	}

	@Override
	protected void configure(final Tree result, final Element source, final XmlViewContext context) {
		super.configure(result, source, context);

		result.setParentProperty(readAttribute(source, PARENT_PROPERTY_ATTRIBUTE_NAME));

		// collection viewer component
		aggregateCollectionViewerComponentProperties(source, result, context);

		// field component
		aggregateFieldComponentProperties(source, result, context, i18nSupport);

		// configure caption property
		result.setCaptionProperty(readAttribute(source, CAPTION_PROPERTY_ATTRIBUTE_NAME));
	}

}

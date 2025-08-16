package net.ibizsys.central.plugin.poi.util;

import java.io.IOException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.FontsDocument;

import fr.opensagres.poi.xwpf.converter.core.openxmlformats.IOpenXMLFormatsPartProvider;
import fr.opensagres.poi.xwpf.converter.core.styles.XWPFStylesDocument;

public class XWPFStylesDocumentEx extends XWPFStylesDocument{

	public final double MARGIN_OFFSET = 4.0;
	
	public XWPFStylesDocumentEx(XWPFDocument document) throws XmlException, IOException {
		super(document);
		// TODO Auto-generated constructor stub
	}

	public XWPFStylesDocumentEx(CTStyles styles, List<FontsDocument> fontsDocuments, List<ThemeDocument> themeDocuments, CTSettings ctSettings, boolean lazyInitialization) throws XmlException, IOException {
		super(styles, fontsDocuments, themeDocuments, ctSettings, lazyInitialization);
		// TODO Auto-generated constructor stub
	}

	public XWPFStylesDocumentEx(IOpenXMLFormatsPartProvider provider, boolean lazyInitialization) throws Exception {
		super(provider, lazyInitialization);
		// TODO Auto-generated constructor stub
	}

	public XWPFStylesDocumentEx(IOpenXMLFormatsPartProvider provider) throws Exception {
		super(provider);
		// TODO Auto-generated constructor stub
	}

	public XWPFStylesDocumentEx(XWPFDocument document, boolean lazyInitialization) throws XmlException, IOException {
		super(document, lazyInitialization);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Float getTableRowMarginBottom(XWPFTableRow row) {
		Float value = super.getTableRowMarginBottom(row);
		if(value == null ) {
			return new Float(MARGIN_OFFSET);
		}
		
		return new Float(value + MARGIN_OFFSET);
		
	}
	
	@Override
	public Float getTableRowMarginTop(XWPFTableRow row) {
		Float value = super.getTableRowMarginTop(row);
		if(value == null ) {
			return new Float(-MARGIN_OFFSET);
		}
		return new Float(value-MARGIN_OFFSET);
	}

}

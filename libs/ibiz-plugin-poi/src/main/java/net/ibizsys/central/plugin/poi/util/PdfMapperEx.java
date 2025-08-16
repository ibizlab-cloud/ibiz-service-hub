package net.ibizsys.central.plugin.poi.util;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark;

import fr.opensagres.poi.xwpf.converter.core.ListItemContext;
import fr.opensagres.poi.xwpf.converter.core.styles.XWPFStylesDocument;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import fr.opensagres.poi.xwpf.converter.pdf.internal.PdfMapper;
import fr.opensagres.xdocreport.itext.extension.ExtendedParagraph;
import fr.opensagres.xdocreport.itext.extension.IITextContainer;

public class PdfMapperEx extends PdfMapper {

	public PdfMapperEx(XWPFDocument document, OutputStream out, PdfOptions options, Integer expectedPageCount) throws Exception {
		super(document, out, options, expectedPageCount);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected XWPFStylesDocument createStylesDocument(XWPFDocument document) throws XmlException, IOException {
		return new XWPFStylesDocumentEx( document );
	}

	
	@Override
	protected IITextContainer startVisitParagraph(XWPFParagraph docxParagraph, ListItemContext itemContext, IITextContainer pdfParentContainer) throws Exception {
		// TODO Auto-generated method stub
		return super.startVisitParagraph(docxParagraph, itemContext, pdfParentContainer);
	}
	
	@Override
	protected void endVisitParagraph(XWPFParagraph docxParagraph, IITextContainer pdfParentContainer, IITextContainer pdfParagraphContainer) throws Exception {
	
//        ExtendedParagraph pdfParagraph = (ExtendedParagraph) pdfParagraphContainer;
//        
//        pdfParentContainer.addElement( pdfParagraph.getElement() );
        
        
        
		super.endVisitParagraph(docxParagraph, pdfParentContainer, pdfParagraphContainer);
	}
	
	@Override
	protected void visitBookmark(CTBookmark bookmark, XWPFParagraph paragraph, IITextContainer paragraphContainer) throws Exception {
		//super.visitBookmark(bookmark, paragraph, paragraphContainer);
	}
}

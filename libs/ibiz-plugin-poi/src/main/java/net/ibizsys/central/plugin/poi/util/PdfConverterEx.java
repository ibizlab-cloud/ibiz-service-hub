package net.ibizsys.central.plugin.poi.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import fr.opensagres.poi.xwpf.converter.core.AbstractXWPFConverter;
import fr.opensagres.poi.xwpf.converter.core.IXWPFConverter;
import fr.opensagres.poi.xwpf.converter.core.XWPFConverterException;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;

public class PdfConverterEx  extends AbstractXWPFConverter<PdfOptions> {

	private static final IXWPFConverter<PdfOptions> INSTANCE = new PdfConverterEx();

	public static IXWPFConverter<PdfOptions> getInstance() {
		return INSTANCE;
	}

	@Override
	protected void doConvert(XWPFDocument document, OutputStream out,
			Writer writer, PdfOptions options) throws XWPFConverterException,
			IOException {
		try {
			// PdfMapper mapper = new PdfMapper( document, out, options );

			// process content
			ByteArrayOutputStream tempOut = new ByteArrayOutputStream();
			PdfMapperEx mapper = new PdfMapperEx(document, tempOut, options, null);
			mapper.start();

			if (mapper.useTotalPageField()) {
				// process content a second time, knowing the expected page
				// number
				Integer actualPageCount = Integer
						.valueOf(mapper.getPageCount());
				mapper = new PdfMapperEx(document, out, options, actualPageCount);
				mapper.start();
			} else {
				out.write(tempOut.toByteArray());
			}

		} catch (Exception e) {
			throw new XWPFConverterException(e);
		}

	}
}

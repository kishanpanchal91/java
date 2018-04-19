
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Namespace;
import org.dom4j.io.DOMReader;
import org.dom4j.io.OutputFormat;
import org.dom4j.Element;
import org.w3c.dom.Document;
import org.dom4j.io.XMLWriter;

public class XMLUtility {

	/**
	 * Converts w3cDocument to dom4jdocument
	 * @param w3cDocument - Instance of org.w3c.dom.Document
	 * @return instance of org.dom4j.Document
	 */
	public static org.dom4j.Document getDom4jDocument(Document w3cDocument)
	{
		//System.out.println("XMLUtility : Inside getDom4jDocument()");
		org.dom4j.Document dom4jDocument  = null;
		DOMReader xmlReader  = null;
		try{
			//System.out.println("Before conversion of w3cdoc to dom4jdoc");
			xmlReader = new DOMReader();			
			dom4jDocument = xmlReader.read(w3cDocument);
			//System.out.println("Conversion complete");
		}catch(Exception e){
			System.out.println("General Exception :- "+e.getMessage());
		}
		//System.out.println("XMLUtility : getDom4jDocument() Finished");
		return dom4jDocument;	
	} 
	
	/**
	 * Converts w3cDocument to dom4jdocument
	 * @param w3cDocument - Instance of org.w3c.dom.Document
	 * @return instance of org.dom4j.Document
	 */
	public static org.dom4j.Document getDom4jDocument(String strXML)
	{
		System.out.println("XMLUtility : Inside getDom4jDocument()");
		org.dom4j.Document dom4jDocument  = null;
		try{
			if(strXML!=null && strXML.trim().length()>0)
			{
				System.out.println("XMLUtility : Before conversion of String to dom4jdoc");
				dom4jDocument = DocumentHelper.parseText(strXML);
				System.out.println("XMLUtility : Conversion complete");
			}
			else
			{
				if(strXML!=null)
				{
					System.out.println("XMLUtility : XML is empty");
				}
				else
				{
					System.out.println("XMLUtility : XML is null");
				}
			}
		}catch(Exception e){
			System.out.println("XMLUtility : General Exception :- "+e.getMessage());
		}
		System.out.println("XMLUtility : getDom4jDocument() Finished");
		return dom4jDocument;	
	}
	
	/**
	 * Convers dom4jDocument to w3cDocument 
	 * @param dom4jDocument - instance of org.dom4j.Document
	 * @return - instance of org.w3c.dom.Document 
	 */
	public static Document getW3cDocument(org.dom4j.Document dom4jDocument)
	{
		System.out.println("XMLUtility : Inside getW3cDocument() ");
		Document document=null;
		
		try {
			org.dom4j.io.DOMWriter writer = new org.dom4j.io.DOMWriter();
			System.out.println("Before conversion of dom4jdoc to w3cdoc");			
			document = writer.write(dom4jDocument);			
			System.out.println("Conversion complete");
		} catch (DocumentException e) {
			System.out.println("Document Exception while converting String value to org.w3c.dom.Document :- "+e.getMessage());
		} catch(Exception e){
			System.out.println("General Exception :- "+e.getMessage());
		}		
		System.out.println("getW3cDocument() Finished");
		return document;
	}
	
	/**
	 * Convers String to w3cDocument 
	 * @param dom4jDocument - instance of org.dom4j.Document
	 * @return - instance of org.w3c.dom.Document 
	 */
	public static Document getW3cDocument(String strXML)
	{
		System.out.println("XMLUtility : Inside getW3cDocument(String) ");
		Document document=null;
		
		try {
			System.out.println("XMLUtility : Before getting dom4jDocument from XML");
			org.dom4j.Document 	dom4jDocument = getDom4jDocument(strXML);
			System.out.println("XMLUtility : Before getting w3cDocument from dom4jdocument");
			document = getW3cDocument(dom4jDocument);
			System.out.println("XMLUtility : Got w3cDocument from dom4jdocument");
		} catch(Exception e){
			System.out.println("XMLUtility : General Exception :- "+e.getMessage());
		}		
		System.out.println("XMLUtility : getW3cDocument() Finished");
		return document;
	}
		
	/**
	 * Returns XML as String from dom4jdocument  
	 * @param dom4jDocument - instance of org.dom4j.Document
	 * @return - instance of org.w3c.dom.Document 
	 */
	public static String getXMLAsString(org.dom4j.Document dom4jDocument)
	{
		//System.out.println("XMLUtility : Inside getXMLAsString() ");
		String strXML="";
		try {
		//	System.out.println("XMLUtility : Before geting XML from dom4jdocument");
			strXML = dom4jDocument.asXML();				
		//	System.out.println("XMLUtility : Conversion complete");
		}  catch(Exception e){
			System.out.println("XMLUtility : General Exception :- "+e.getMessage());
		}		
		//System.out.println("XMLUtility : getXMLAsString() Finished");
		return strXML;
	}
	
	/**
	 * Returns XML as String from w3cdocument
	 * @param w3cDocument - instance of org.w3c.dom.Document
	 * @return - instance of org.w3c.dom.Document 
	 */
	public static String getXMLAsString(Document w3cDocument)
	{
		//System.out.println("XMLUtility : Inside getXMLAsString() ");
		org.dom4j.Document document=null;
		String strXML="";
		try {
		//	System.out.println("XMLUtility : Before getting XML from w3cdocument");
			document = getDom4jDocument(w3cDocument);
		//	System.out.println("XMLUtility : After getting XML from w3cdocument");			
			strXML = document.asXML();
		//	System.out.println("XMLUtility : XMLUtility : Conversion complete");
		}  catch(Exception e){
			System.out.println("XMLUtility : General Exception :- "+e.getMessage());
		}		
		//System.out.println("XMLUtility : getXMLAsString() Finished");
		return strXML;
	}
	

	/**
	 * Returns well formated XML as String from dom4jdocument  
	 * @param dom4jDocument - instance of org.dom4j.Document
	 * @return - instance of org.w3c.dom.Document 
	 */
	public static String getPrettyPrintedXMLAsString(org.dom4j.Document dom4jDocument)
	{
		//System.out.println("XMLUtility : Inside getPrettyPrintedXMLAsString() ");
		String strXML="";
		try {
		//	System.out.println("XMLUtility : Before geting XML from dom4jdocument");
			StringWriter outStringWriter = new StringWriter();
	        XMLWriter writer = new XMLWriter(outStringWriter, OutputFormat.createPrettyPrint());
	        System.out.println("XMLUtility : Got XMLWriter Instance");
	        writer.write(dom4jDocument);
	  //      System.out.println("XMLUtility : Writing pretty printed xml to original document");
	        writer.close();
	   //     System.out.println("XMLUtility : XMLWriter closed");
	        strXML = outStringWriter.toString();				
		//	System.out.println("XMLUtility : Conversion complete");
		}  catch(Exception e){
			System.out.println("XMLUtility : getPrettyPrintedXMLAsString - General Exception :- "+e.getMessage());
		}		
		//System.out.println("XMLUtility : getPrettyPrintedXMLAsString() Finished");
		return strXML;
	}
	
	/**
	 * Returns wll formated XML as String from w3cdocument
	 * @param w3cDocument - instance of org.w3c.dom.Document
	 * @return - instance of org.w3c.dom.Document 
	 */
	public static String getPrettyPrintedXMLAsString(Document w3cDocument)
	{
		//System.out.println("XMLUtility : Inside getPrettyPrintedXMLAsString() ");
		org.dom4j.Document document=null;
		String strXML="";
		try {
			
			document = getDom4jDocument(w3cDocument);
			System.out.println("XMLUtility : Before geting XML from w3cdocument");			
			strXML = XMLUtility.getPrettyPrintedXMLAsString(document);
		}  catch(Exception e){
			System.out.println("XMLUtility : getPrettyPrintedXMLAsString() - General Exception :- "+e.getMessage());
		}		
		//System.out.println("XMLUtility : getPrettyPrintedXMLAsString() Finished");
		return strXML;
	}
	
	/**
	 * Removes encoding from given XML document
	 * @param strXML - XML string
	 * @return XML withoud encoding
	 */
	public static String removeEncoding(String strXML)
	{
		String strEncoding = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";				
		int i = strXML.indexOf("<?");
		int j = strXML.indexOf("?>");
		if(i >=0 && j>=0)
		{
			strEncoding = strXML.substring(i,j+2);
			
		}
		int index = strXML.indexOf(strEncoding);
		if(index >=0)
		{
			strXML = strXML.substring(index+strEncoding.length());
		}
		return strXML;
	}
	
	/**
	 * Returns Hashmap of namespace of given document
	 * @param doc - Dom4j document
	 * @return
	 */
	public static Map getQNameCache(org.dom4j.Document doc)
	{
		Map mapNameSpaces = new HashMap();
		
		mapNameSpaces = getQNameCacheForChild(mapNameSpaces , doc );
		System.out.println("Final NameSpace : "+mapNameSpaces);
		return mapNameSpaces;
	}
	
	public static Map getQNameCacheForChild(Map mapNameSpaces ,org.dom4j.Document doc)
	{
		Element root = doc.getRootElement();
		
		mapNameSpaces = getQNameCache(mapNameSpaces,root);
		
		List lstElements = root.elements();
		Iterator iteElements = lstElements.iterator();
		
		while(iteElements.hasNext())
		{
			Element element =(Element)iteElements.next();
			if(element.isTextOnly())
			{
				mapNameSpaces = getQNameCache(mapNameSpaces,element);
				//System.out.println(" is Text Only");
				
			}
			else
			{
				String strDoc = element.asXML();
				mapNameSpaces = getQNameCacheForChild(mapNameSpaces,XMLUtility.getDom4jDocument(strDoc));
			}
		}
		return mapNameSpaces;
	}
	
	/**
	 * Returns Hashmap of namespace of given element
	 * @param Map - Map of NameSpace
	 * @param Element 
	 * @return
	 */
	public static Map getQNameCache(Map mapNameSpaces ,Element element)
	{
		List lstNameSpaces = element.declaredNamespaces();		
		Namespace nameSpace = null;	
		//System.out.println("List of NameSpaces : "+lstNameSpaces);
		for(Iterator iter = lstNameSpaces.iterator();iter.hasNext();)
		{
			nameSpace = (Namespace) iter.next();
			//System.out.println("NameSpace : "+nameSpace);
			mapNameSpaces.put(nameSpace.getPrefix(),nameSpace.getURI());
		}
		return mapNameSpaces;
	}
}

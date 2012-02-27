package org.eclipse.xtext.example.domainmodel.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class HTMLBuilder {
	private final DocumentBuilderFactory factory;
	private final DocumentBuilder builder;
	private final DOMImplementation dom;
	private Document doc;

	public HTMLBuilder() throws ParserConfigurationException {
		this.factory = DocumentBuilderFactory.newInstance();
		builder = factory.newDocumentBuilder();
		dom = builder.getDOMImplementation();
	}

	public Document newDoc(final Procedure1<Document> init) {
		final Document doc = dom.createDocument(null, null, null);
		this.doc = doc;
		if (init != null && doc != null)
			init.apply(doc);
		return doc;
	}

	/**
	 * Creates a a node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created a node
	 */
	public Node a(final Node parent, final Procedure1<Node> init){
		final Node a = doc.createElement("a");
		parent.appendChild(a);
		if(init != null)
			init.apply(a);
		return a;
	}

	/**
	 * Creates a abbr node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created abbr node
	 */
	public Node abbr(final Node parent, final Procedure1<Node> init){
		final Node abbr = doc.createElement("abbr");
		parent.appendChild(abbr);
		if(init != null)
			init.apply(abbr);
		return abbr;
	}

	/**
	 * Creates a acronym node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created acronym node
	 */
	public Node acronym(final Node parent, final Procedure1<Node> init){
		final Node acronym = doc.createElement("acronym");
		parent.appendChild(acronym);
		if(init != null)
			init.apply(acronym);
		return acronym;
	}

	/**
	 * Creates a address node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created address node
	 */
	public Node address(final Node parent, final Procedure1<Node> init){
		final Node address = doc.createElement("address");
		parent.appendChild(address);
		if(init != null)
			init.apply(address);
		return address;
	}

	/**
	 * Creates a applet node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created applet node
	 */
	public Node applet(final Node parent, final Procedure1<Node> init){
		final Node applet = doc.createElement("applet");
		parent.appendChild(applet);
		if(init != null)
			init.apply(applet);
		return applet;
	}

	/**
	 * Creates a area node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created area node
	 */
	public Node area(final Node parent, final Procedure1<Node> init){
		final Node area = doc.createElement("area");
		parent.appendChild(area);
		if(init != null)
			init.apply(area);
		return area;
	}

	/**
	 * Creates a b node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created b node
	 */
	public Node b(final Node parent, final Procedure1<Node> init){
		final Node b = doc.createElement("b");
		parent.appendChild(b);
		if(init != null)
			init.apply(b);
		return b;
	}

	/**
	 * Creates a base node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created base node
	 */
	public Node base(final Node parent, final Procedure1<Node> init){
		final Node base = doc.createElement("base");
		parent.appendChild(base);
		if(init != null)
			init.apply(base);
		return base;
	}

	/**
	 * Creates a basefont node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created basefont node
	 */
	public Node basefont(final Node parent, final Procedure1<Node> init){
		final Node basefont = doc.createElement("basefont");
		parent.appendChild(basefont);
		if(init != null)
			init.apply(basefont);
		return basefont;
	}

	/**
	 * Creates a bdo node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created bdo node
	 */
	public Node bdo(final Node parent, final Procedure1<Node> init){
		final Node bdo = doc.createElement("bdo");
		parent.appendChild(bdo);
		if(init != null)
			init.apply(bdo);
		return bdo;
	}

	/**
	 * Creates a big node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created big node
	 */
	public Node big(final Node parent, final Procedure1<Node> init){
		final Node big = doc.createElement("big");
		parent.appendChild(big);
		if(init != null)
			init.apply(big);
		return big;
	}

	/**
	 * Creates a blockquote node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created blockquote node
	 */
	public Node blockquote(final Node parent, final Procedure1<Node> init){
		final Node blockquote = doc.createElement("blockquote");
		parent.appendChild(blockquote);
		if(init != null)
			init.apply(blockquote);
		return blockquote;
	}

	/**
	 * Creates a body node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created body node
	 */
	public Node body(final Node parent, final Procedure1<Node> init){
		final Node body = doc.createElement("body");
		parent.appendChild(body);
		if(init != null)
			init.apply(body);
		return body;
	}

	/**
	 * Creates a br node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created br node
	 */
	public Node br(final Node parent, final Procedure1<Node> init){
		final Node br = doc.createElement("br");
		parent.appendChild(br);
		if(init != null)
			init.apply(br);
		return br;
	}

	/**
	 * Creates a button node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created button node
	 */
	public Node button(final Node parent, final Procedure1<Node> init){
		final Node button = doc.createElement("button");
		parent.appendChild(button);
		if(init != null)
			init.apply(button);
		return button;
	}

	/**
	 * Creates a caption node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created caption node
	 */
	public Node caption(final Node parent, final Procedure1<Node> init){
		final Node caption = doc.createElement("caption");
		parent.appendChild(caption);
		if(init != null)
			init.apply(caption);
		return caption;
	}

	/**
	 * Creates a center node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created center node
	 */
	public Node center(final Node parent, final Procedure1<Node> init){
		final Node center = doc.createElement("center");
		parent.appendChild(center);
		if(init != null)
			init.apply(center);
		return center;
	}

	/**
	 * Creates a cite node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created cite node
	 */
	public Node cite(final Node parent, final Procedure1<Node> init){
		final Node cite = doc.createElement("cite");
		parent.appendChild(cite);
		if(init != null)
			init.apply(cite);
		return cite;
	}

	/**
	 * Creates a code node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created code node
	 */
	public Node code(final Node parent, final Procedure1<Node> init){
		final Node code = doc.createElement("code");
		parent.appendChild(code);
		if(init != null)
			init.apply(code);
		return code;
	}

	/**
	 * Creates a col node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created col node
	 */
	public Node col(final Node parent, final Procedure1<Node> init){
		final Node col = doc.createElement("col");
		parent.appendChild(col);
		if(init != null)
			init.apply(col);
		return col;
	}

	/**
	 * Creates a colgroup node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created colgroup node
	 */
	public Node colgroup(final Node parent, final Procedure1<Node> init){
		final Node colgroup = doc.createElement("colgroup");
		parent.appendChild(colgroup);
		if(init != null)
			init.apply(colgroup);
		return colgroup;
	}

	/**
	 * Creates a dd node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created dd node
	 */
	public Node dd(final Node parent, final Procedure1<Node> init){
		final Node dd = doc.createElement("dd");
		parent.appendChild(dd);
		if(init != null)
			init.apply(dd);
		return dd;
	}

	/**
	 * Creates a del node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created del node
	 */
	public Node del(final Node parent, final Procedure1<Node> init){
		final Node del = doc.createElement("del");
		parent.appendChild(del);
		if(init != null)
			init.apply(del);
		return del;
	}

	/**
	 * Creates a dfn node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created dfn node
	 */
	public Node dfn(final Node parent, final Procedure1<Node> init){
		final Node dfn = doc.createElement("dfn");
		parent.appendChild(dfn);
		if(init != null)
			init.apply(dfn);
		return dfn;
	}

	/**
	 * Creates a dir node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created dir node
	 */
	public Node dir(final Node parent, final Procedure1<Node> init){
		final Node dir = doc.createElement("dir");
		parent.appendChild(dir);
		if(init != null)
			init.apply(dir);
		return dir;
	}

	/**
	 * Creates a div node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created div node
	 */
	public Node div(final Node parent, final Procedure1<Node> init){
		final Node div = doc.createElement("div");
		parent.appendChild(div);
		if(init != null)
			init.apply(div);
		return div;
	}

	/**
	 * Creates a dl node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created dl node
	 */
	public Node dl(final Node parent, final Procedure1<Node> init){
		final Node dl = doc.createElement("dl");
		parent.appendChild(dl);
		if(init != null)
			init.apply(dl);
		return dl;
	}

	/**
	 * Creates a dt node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created dt node
	 */
	public Node dt(final Node parent, final Procedure1<Node> init){
		final Node dt = doc.createElement("dt");
		parent.appendChild(dt);
		if(init != null)
			init.apply(dt);
		return dt;
	}

	/**
	 * Creates a em node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created em node
	 */
	public Node em(final Node parent, final Procedure1<Node> init){
		final Node em = doc.createElement("em");
		parent.appendChild(em);
		if(init != null)
			init.apply(em);
		return em;
	}

	/**
	 * Creates a fieldset node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created fieldset node
	 */
	public Node fieldset(final Node parent, final Procedure1<Node> init){
		final Node fieldset = doc.createElement("fieldset");
		parent.appendChild(fieldset);
		if(init != null)
			init.apply(fieldset);
		return fieldset;
	}

	/**
	 * Creates a font node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created font node
	 */
	public Node font(final Node parent, final Procedure1<Node> init){
		final Node font = doc.createElement("font");
		parent.appendChild(font);
		if(init != null)
			init.apply(font);
		return font;
	}

	/**
	 * Creates a form node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created form node
	 */
	public Node form(final Node parent, final Procedure1<Node> init){
		final Node form = doc.createElement("form");
		parent.appendChild(form);
		if(init != null)
			init.apply(form);
		return form;
	}

	/**
	 * Creates a frame node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created frame node
	 */
	public Node frame(final Node parent, final Procedure1<Node> init){
		final Node frame = doc.createElement("frame");
		parent.appendChild(frame);
		if(init != null)
			init.apply(frame);
		return frame;
	}

	/**
	 * Creates a frameset node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created frameset node
	 */
	public Node frameset(final Node parent, final Procedure1<Node> init){
		final Node frameset = doc.createElement("frameset");
		parent.appendChild(frameset);
		if(init != null)
			init.apply(frameset);
		return frameset;
	}

	/**
	 * Creates a head node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created head node
	 */
	public Node head(final Node parent, final Procedure1<Node> init){
		final Node head = doc.createElement("head");
		parent.appendChild(head);
		if(init != null)
			init.apply(head);
		return head;
	}

	/**
	 * Creates a h1 node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created h1 node
	 */
	public Node h1(final Node parent, final Procedure1<Node> init){
		final Node h1 = doc.createElement("h1");
		parent.appendChild(h1);
		if(init != null)
			init.apply(h1);
		return h1;
	}

	/**
	 * Creates a h2 node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created h2 node
	 */
	public Node h2(final Node parent, final Procedure1<Node> init){
		final Node h2 = doc.createElement("h2");
		parent.appendChild(h2);
		if(init != null)
			init.apply(h2);
		return h2;
	}

	/**
	 * Creates a h3 node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created h3 node
	 */
	public Node h3(final Node parent, final Procedure1<Node> init){
		final Node h3 = doc.createElement("h3");
		parent.appendChild(h3);
		if(init != null)
			init.apply(h3);
		return h3;
	}

	/**
	 * Creates a h4 node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created h4 node
	 */
	public Node h4(final Node parent, final Procedure1<Node> init){
		final Node h4 = doc.createElement("h4");
		parent.appendChild(h4);
		if(init != null)
			init.apply(h4);
		return h4;
	}

	/**
	 * Creates a h5 node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created h5 node
	 */
	public Node h5(final Node parent, final Procedure1<Node> init){
		final Node h5 = doc.createElement("h5");
		parent.appendChild(h5);
		if(init != null)
			init.apply(h5);
		return h5;
	}

	/**
	 * Creates a h6 node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created h6 node
	 */
	public Node h6(final Node parent, final Procedure1<Node> init){
		final Node h6 = doc.createElement("h6");
		parent.appendChild(h6);
		if(init != null)
			init.apply(h6);
		return h6;
	}

	/**
	 * Creates a hr node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created hr node
	 */
	public Node hr(final Node parent, final Procedure1<Node> init){
		final Node hr = doc.createElement("hr");
		parent.appendChild(hr);
		if(init != null)
			init.apply(hr);
		return hr;
	}

	/**
	 * Creates a html node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created html node
	 */
	public Node html(final Node parent, final Procedure1<Node> init){
		final Node html = doc.createElement("html");
		parent.appendChild(html);
		if(init != null)
			init.apply(html);
		return html;
	}

	/**
	 * Creates a i node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created i node
	 */
	public Node i(final Node parent, final Procedure1<Node> init){
		final Node i = doc.createElement("i");
		parent.appendChild(i);
		if(init != null)
			init.apply(i);
		return i;
	}

	/**
	 * Creates a iframe node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created iframe node
	 */
	public Node iframe(final Node parent, final Procedure1<Node> init){
		final Node iframe = doc.createElement("iframe");
		parent.appendChild(iframe);
		if(init != null)
			init.apply(iframe);
		return iframe;
	}

	/**
	 * Creates a img node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created img node
	 */
	public Node img(final Node parent, final Procedure1<Node> init){
		final Node img = doc.createElement("img");
		parent.appendChild(img);
		if(init != null)
			init.apply(img);
		return img;
	}

	/**
	 * Creates a input node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created input node
	 */
	public Node input(final Node parent, final Procedure1<Node> init){
		final Node input = doc.createElement("input");
		parent.appendChild(input);
		if(init != null)
			init.apply(input);
		return input;
	}

	/**
	 * Creates a ins node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created ins node
	 */
	public Node ins(final Node parent, final Procedure1<Node> init){
		final Node ins = doc.createElement("ins");
		parent.appendChild(ins);
		if(init != null)
			init.apply(ins);
		return ins;
	}

	/**
	 * Creates a kbd node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created kbd node
	 */
	public Node kbd(final Node parent, final Procedure1<Node> init){
		final Node kbd = doc.createElement("kbd");
		parent.appendChild(kbd);
		if(init != null)
			init.apply(kbd);
		return kbd;
	}

	/**
	 * Creates a label node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created label node
	 */
	public Node label(final Node parent, final Procedure1<Node> init){
		final Node label = doc.createElement("label");
		parent.appendChild(label);
		if(init != null)
			init.apply(label);
		return label;
	}

	/**
	 * Creates a legend node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created legend node
	 */
	public Node legend(final Node parent, final Procedure1<Node> init){
		final Node legend = doc.createElement("legend");
		parent.appendChild(legend);
		if(init != null)
			init.apply(legend);
		return legend;
	}

	/**
	 * Creates a li node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created li node
	 */
	public Node li(final Node parent, final Procedure1<Node> init){
		final Node li = doc.createElement("li");
		parent.appendChild(li);
		if(init != null)
			init.apply(li);
		return li;
	}

	/**
	 * Creates a link node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created link node
	 */
	public Node link(final Node parent, final Procedure1<Node> init){
		final Node link = doc.createElement("link");
		parent.appendChild(link);
		if(init != null)
			init.apply(link);
		return link;
	}

	/**
	 * Creates a map node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created map node
	 */
	public Node map(final Node parent, final Procedure1<Node> init){
		final Node map = doc.createElement("map");
		parent.appendChild(map);
		if(init != null)
			init.apply(map);
		return map;
	}

	/**
	 * Creates a menu node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created menu node
	 */
	public Node menu(final Node parent, final Procedure1<Node> init){
		final Node menu = doc.createElement("menu");
		parent.appendChild(menu);
		if(init != null)
			init.apply(menu);
		return menu;
	}

	/**
	 * Creates a meta node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created meta node
	 */
	public Node meta(final Node parent, final Procedure1<Node> init){
		final Node meta = doc.createElement("meta");
		parent.appendChild(meta);
		if(init != null)
			init.apply(meta);
		return meta;
	}

	/**
	 * Creates a noframes node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created noframes node
	 */
	public Node noframes(final Node parent, final Procedure1<Node> init){
		final Node noframes = doc.createElement("noframes");
		parent.appendChild(noframes);
		if(init != null)
			init.apply(noframes);
		return noframes;
	}

	/**
	 * Creates a noscript node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created noscript node
	 */
	public Node noscript(final Node parent, final Procedure1<Node> init){
		final Node noscript = doc.createElement("noscript");
		parent.appendChild(noscript);
		if(init != null)
			init.apply(noscript);
		return noscript;
	}

	/**
	 * Creates a object node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created object node
	 */
	public Node object(final Node parent, final Procedure1<Node> init){
		final Node object = doc.createElement("object");
		parent.appendChild(object);
		if(init != null)
			init.apply(object);
		return object;
	}

	/**
	 * Creates a ol node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created ol node
	 */
	public Node ol(final Node parent, final Procedure1<Node> init){
		final Node ol = doc.createElement("ol");
		parent.appendChild(ol);
		if(init != null)
			init.apply(ol);
		return ol;
	}

	/**
	 * Creates a optgroup node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created optgroup node
	 */
	public Node optgroup(final Node parent, final Procedure1<Node> init){
		final Node optgroup = doc.createElement("optgroup");
		parent.appendChild(optgroup);
		if(init != null)
			init.apply(optgroup);
		return optgroup;
	}

	/**
	 * Creates a option node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created option node
	 */
	public Node option(final Node parent, final Procedure1<Node> init){
		final Node option = doc.createElement("option");
		parent.appendChild(option);
		if(init != null)
			init.apply(option);
		return option;
	}

	/**
	 * Creates a p node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created p node
	 */
	public Node p(final Node parent, final Procedure1<Node> init){
		final Node p = doc.createElement("p");
		parent.appendChild(p);
		if(init != null)
			init.apply(p);
		return p;
	}

	/**
	 * Creates a param node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created param node
	 */
	public Node param(final Node parent, final Procedure1<Node> init){
		final Node param = doc.createElement("param");
		parent.appendChild(param);
		if(init != null)
			init.apply(param);
		return param;
	}

	/**
	 * Creates a pre node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created pre node
	 */
	public Node pre(final Node parent, final Procedure1<Node> init){
		final Node pre = doc.createElement("pre");
		parent.appendChild(pre);
		if(init != null)
			init.apply(pre);
		return pre;
	}

	/**
	 * Creates a q node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created q node
	 */
	public Node q(final Node parent, final Procedure1<Node> init){
		final Node q = doc.createElement("q");
		parent.appendChild(q);
		if(init != null)
			init.apply(q);
		return q;
	}

	/**
	 * Creates a s node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created s node
	 */
	public Node s(final Node parent, final Procedure1<Node> init){
		final Node s = doc.createElement("s");
		parent.appendChild(s);
		if(init != null)
			init.apply(s);
		return s;
	}

	/**
	 * Creates a samp node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created samp node
	 */
	public Node samp(final Node parent, final Procedure1<Node> init){
		final Node samp = doc.createElement("samp");
		parent.appendChild(samp);
		if(init != null)
			init.apply(samp);
		return samp;
	}

	/**
	 * Creates a script node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created script node
	 */
	public Node script(final Node parent, final Procedure1<Node> init){
		final Node script = doc.createElement("script");
		parent.appendChild(script);
		if(init != null)
			init.apply(script);
		return script;
	}

	/**
	 * Creates a select node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created select node
	 */
	public Node select(final Node parent, final Procedure1<Node> init){
		final Node select = doc.createElement("select");
		parent.appendChild(select);
		if(init != null)
			init.apply(select);
		return select;
	}

	/**
	 * Creates a small node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created small node
	 */
	public Node small(final Node parent, final Procedure1<Node> init){
		final Node small = doc.createElement("small");
		parent.appendChild(small);
		if(init != null)
			init.apply(small);
		return small;
	}

	/**
	 * Creates a span node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created span node
	 */
	public Node span(final Node parent, final Procedure1<Node> init){
		final Node span = doc.createElement("span");
		parent.appendChild(span);
		if(init != null)
			init.apply(span);
		return span;
	}

	/**
	 * Creates a strike node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created strike node
	 */
	public Node strike(final Node parent, final Procedure1<Node> init){
		final Node strike = doc.createElement("strike");
		parent.appendChild(strike);
		if(init != null)
			init.apply(strike);
		return strike;
	}

	/**
	 * Creates a strong node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created strong node
	 */
	public Node strong(final Node parent, final Procedure1<Node> init){
		final Node strong = doc.createElement("strong");
		parent.appendChild(strong);
		if(init != null)
			init.apply(strong);
		return strong;
	}

	/**
	 * Creates a style node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created style node
	 */
	public Node style(final Node parent, final Procedure1<Node> init){
		final Node style = doc.createElement("style");
		parent.appendChild(style);
		if(init != null)
			init.apply(style);
		return style;
	}

	/**
	 * Creates a sub node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created sub node
	 */
	public Node sub(final Node parent, final Procedure1<Node> init){
		final Node sub = doc.createElement("sub");
		parent.appendChild(sub);
		if(init != null)
			init.apply(sub);
		return sub;
	}

	/**
	 * Creates a sup node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created sup node
	 */
	public Node sup(final Node parent, final Procedure1<Node> init){
		final Node sup = doc.createElement("sup");
		parent.appendChild(sup);
		if(init != null)
			init.apply(sup);
		return sup;
	}

	/**
	 * Creates a table node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created table node
	 */
	public Node table(final Node parent, final Procedure1<Node> init){
		final Node table = doc.createElement("table");
		parent.appendChild(table);
		if(init != null)
			init.apply(table);
		return table;
	}

	/**
	 * Creates a tbody node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created tbody node
	 */
	public Node tbody(final Node parent, final Procedure1<Node> init){
		final Node tbody = doc.createElement("tbody");
		parent.appendChild(tbody);
		if(init != null)
			init.apply(tbody);
		return tbody;
	}

	/**
	 * Creates a td node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created td node
	 */
	public Node td(final Node parent, final Procedure1<Node> init){
		final Node td = doc.createElement("td");
		parent.appendChild(td);
		if(init != null)
			init.apply(td);
		return td;
	}

	/**
	 * Creates a textarea node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created textarea node
	 */
	public Node textarea(final Node parent, final Procedure1<Node> init){
		final Node textarea = doc.createElement("textarea");
		parent.appendChild(textarea);
		if(init != null)
			init.apply(textarea);
		return textarea;
	}

	/**
	 * Creates a tfoot node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created tfoot node
	 */
	public Node tfoot(final Node parent, final Procedure1<Node> init){
		final Node tfoot = doc.createElement("tfoot");
		parent.appendChild(tfoot);
		if(init != null)
			init.apply(tfoot);
		return tfoot;
	}

	/**
	 * Creates a th node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created th node
	 */
	public Node th(final Node parent, final Procedure1<Node> init){
		final Node th = doc.createElement("th");
		parent.appendChild(th);
		if(init != null)
			init.apply(th);
		return th;
	}

	/**
	 * Creates a thead node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created thead node
	 */
	public Node thead(final Node parent, final Procedure1<Node> init){
		final Node thead = doc.createElement("thead");
		parent.appendChild(thead);
		if(init != null)
			init.apply(thead);
		return thead;
	}

	/**
	 * Creates a title node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created title node
	 */
	public Node title(final Node parent, final Procedure1<Node> init){
		final Node title = doc.createElement("title");
		parent.appendChild(title);
		if(init != null)
			init.apply(title);
		return title;
	}

	/**
	 * Creates a tr node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created tr node
	 */
	public Node tr(final Node parent, final Procedure1<Node> init){
		final Node tr = doc.createElement("tr");
		parent.appendChild(tr);
		if(init != null)
			init.apply(tr);
		return tr;
	}

	/**
	 * Creates a tt node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created tt node
	 */
	public Node tt(final Node parent, final Procedure1<Node> init){
		final Node tt = doc.createElement("tt");
		parent.appendChild(tt);
		if(init != null)
			init.apply(tt);
		return tt;
	}

	/**
	 * Creates a u node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created u node
	 */
	public Node u(final Node parent, final Procedure1<Node> init){
		final Node u = doc.createElement("u");
		parent.appendChild(u);
		if(init != null)
			init.apply(u);
		return u;
	}

	/**
	 * Creates a ul node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created ul node
	 */
	public Node ul(final Node parent, final Procedure1<Node> init){
		final Node ul = doc.createElement("ul");
		parent.appendChild(ul);
		if(init != null)
			init.apply(ul);
		return ul;
	}

	/**
	 * Creates a var node and appends it to the given parent
	 * 
	 * @param parent the parent node
	 * @param init an initialization procedure
	 * 
	 * @return the created var node
	 */
	public Node var(final Node parent, final Procedure1<Node> init){
		final Node var = doc.createElement("var");
		parent.appendChild(var);
		if(init != null)
			init.apply(var);
		return var;
	}

}

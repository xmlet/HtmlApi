package org.xmlet.htmlapi;

public abstract class ElementVisitor<R> {
   public abstract <T extends Element> void sharedVisit(Element<T, ?> var1);

   public abstract void visit(Text var1);

   public abstract void visit(Comment var1);

   public abstract <U> void visit(TextFunction<R, U, ?> var1);

   public void visit(Select select) {
      this.sharedVisit(select);
   }

   public void visit(Legend legend) {
      this.sharedVisit(legend);
   }

   public void visit(Textarea textarea) {
      this.sharedVisit(textarea);
   }

   public void visit(Caption caption) {
      this.sharedVisit(caption);
   }

   public void visit(Del del) {
      this.sharedVisit(del);
   }

   public void visit(Hr hr) {
      this.sharedVisit(hr);
   }

   public void visit(Output output) {
      this.sharedVisit(output);
   }

   public void visit(Embed embed) {
      this.sharedVisit(embed);
   }

   public void visit(Abbr abbr) {
      this.sharedVisit(abbr);
   }

   public void visit(Nav nav) {
      this.sharedVisit(nav);
   }

   public void visit(Canvas canvas) {
      this.sharedVisit(canvas);
   }

   public void visit(Var var) {
      this.sharedVisit(var);
   }

   public void visit(Mathml mathml) {
      this.sharedVisit(mathml);
   }

   public void visit(Dfn dfn) {
      this.sharedVisit(dfn);
   }

   public void visit(Script script) {
      this.sharedVisit(script);
   }

   public void visit(Input input) {
      this.sharedVisit(input);
   }

   public void visit(Meta meta) {
      this.sharedVisit(meta);
   }

   public void visit(Style style) {
      this.sharedVisit(style);
   }

   public void visit(Rp rp) {
      this.sharedVisit(rp);
   }

   public void visit(Object object) {
      this.sharedVisit(object);
   }

   public void visit(Sub sub) {
      this.sharedVisit(sub);
   }

   public void visit(Strong strong) {
      this.sharedVisit(strong);
   }

   public void visit(Rt rt) {
      this.sharedVisit(rt);
   }

   public void visit(Samp samp) {
      this.sharedVisit(samp);
   }

   public void visit(Hgroup hgroup) {
      this.sharedVisit(hgroup);
   }

   public void visit(Sup sup) {
      this.sharedVisit(sup);
   }

   public void visit(Br br) {
      this.sharedVisit(br);
   }

   public void visit(Iframe iframe) {
      this.sharedVisit(iframe);
   }

   public void visit(Audio audio) {
      this.sharedVisit(audio);
   }

   public void visit(Map map) {
      this.sharedVisit(map);
   }

   public void visit(Table table) {
      this.sharedVisit(table);
   }

   public void visit(A a) {
      this.sharedVisit(a);
   }

   public void visit(B b) {
      this.sharedVisit(b);
   }

   public void visit(Address address) {
      this.sharedVisit(address);
   }

   public void visit(Svg svg) {
      this.sharedVisit(svg);
   }

   public void visit(I i) {
      this.sharedVisit(i);
   }

   public void visit(Bdo bdo) {
      this.sharedVisit(bdo);
   }

   public void visit(Menu menu) {
      this.sharedVisit(menu);
   }

   public void visit(P p) {
      this.sharedVisit(p);
   }

   public void visit(Tfoot tfoot) {
      this.sharedVisit(tfoot);
   }

   public void visit(Td td) {
      this.sharedVisit(td);
   }

   public void visit(Q q) {
      this.sharedVisit(q);
   }

   public void visit(Th th) {
      this.sharedVisit(th);
   }

   public void visit(Cite cite) {
      this.sharedVisit(cite);
   }

   public void visit(Progress progress) {
      this.sharedVisit(progress);
   }

   public void visit(Li li) {
      this.sharedVisit(li);
   }

   public void visit(Tr tr) {
      this.sharedVisit(tr);
   }

   public void visit(Span span) {
      this.sharedVisit(span);
   }

   public void visit(Dd dd) {
      this.sharedVisit(dd);
   }

   public void visit(Small small) {
      this.sharedVisit(small);
   }

   public void visit(Col col) {
      this.sharedVisit(col);
   }

   public void visit(Optgroup optgroup) {
      this.sharedVisit(optgroup);
   }

   public void visit(Tbody tbody) {
      this.sharedVisit(tbody);
   }

   public void visit(Dl dl) {
      this.sharedVisit(dl);
   }

   public void visit(Fieldset fieldset) {
      this.sharedVisit(fieldset);
   }

   public void visit(Section section) {
      this.sharedVisit(section);
   }

   public void visit(Source source) {
      this.sharedVisit(source);
   }

   public void visit(Body body) {
      this.sharedVisit(body);
   }

   public void visit(Dt dt) {
      this.sharedVisit(dt);
   }

   public void visit(Div div) {
      this.sharedVisit(div);
   }

   public void visit(Ul ul) {
      this.sharedVisit(ul);
   }

   public void visit(Html html) {
      this.sharedVisit(html);
   }

   public void visit(Details details) {
      this.sharedVisit(details);
   }

   public void visit(Area area) {
      this.sharedVisit(area);
   }

   public void visit(Pre pre) {
      this.sharedVisit(pre);
   }

   public void visit(Blockquote blockquote) {
      this.sharedVisit(blockquote);
   }

   public void visit(Meter meter) {
      this.sharedVisit(meter);
   }

   public void visit(Em em) {
      this.sharedVisit(em);
   }

   public void visit(Article article) {
      this.sharedVisit(article);
   }

   public void visit(Aside aside) {
      this.sharedVisit(aside);
   }

   public void visit(Noscript noscript) {
      this.sharedVisit(noscript);
   }

   public void visit(Header header) {
      this.sharedVisit(header);
   }

   public void visit(Option option) {
      this.sharedVisit(option);
   }

   public void visit(Img img) {
      this.sharedVisit(img);
   }

   public void visit(Code code) {
      this.sharedVisit(code);
   }

   public void visit(Footer footer) {
      this.sharedVisit(footer);
   }

   public void visit(Thead thead) {
      this.sharedVisit(thead);
   }

   public void visit(Link link) {
      this.sharedVisit(link);
   }

   public void visit(H1 h1) {
      this.sharedVisit(h1);
   }

   public void visit(H2 h2) {
      this.sharedVisit(h2);
   }

   public void visit(H3 h3) {
      this.sharedVisit(h3);
   }

   public void visit(Video video) {
      this.sharedVisit(video);
   }

   public void visit(Title title) {
      this.sharedVisit(title);
   }

   public void visit(H4 h4) {
      this.sharedVisit(h4);
   }

   public void visit(H5 h5) {
      this.sharedVisit(h5);
   }

   public void visit(H6 h6) {
      this.sharedVisit(h6);
   }

   public void visit(Keygen keygen) {
      this.sharedVisit(keygen);
   }

   public void visit(Head head) {
      this.sharedVisit(head);
   }

   public void visit(Button button) {
      this.sharedVisit(button);
   }

   public void visit(Dialog dialog) {
      this.sharedVisit(dialog);
   }

   public void visit(Param param) {
      this.sharedVisit(param);
   }

   public void visit(Ol ol) {
      this.sharedVisit(ol);
   }

   public void visit(Figure figure) {
      this.sharedVisit(figure);
   }

   public void visit(Datalist datalist) {
      this.sharedVisit(datalist);
   }

   public void visit(Label label) {
      this.sharedVisit(label);
   }

   public void visit(Colgroup colgroup) {
      this.sharedVisit(colgroup);
   }

   public void visit(Kbd kbd) {
      this.sharedVisit(kbd);
   }

   public void visit(Command command) {
      this.sharedVisit(command);
   }

   public void visit(Ruby ruby) {
      this.sharedVisit(ruby);
   }

   public void visit(Ins ins) {
      this.sharedVisit(ins);
   }

   public void visit(Form form) {
      this.sharedVisit(form);
   }

   public void visit(Time time) {
      this.sharedVisit(time);
   }

   public void visit(Mark mark) {
      this.sharedVisit(mark);
   }

   public void visit(Base base) {
      this.sharedVisit(base);
   }
}

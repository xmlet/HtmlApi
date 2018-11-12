package org.xmlet.htmlapi;

public class Text<Z extends Element> extends AbstractElement<Text<Z>, Z> {
   private String text;

   public Text() {
      super("text");
   }

   public Text(Z parent, String text) {
      super(parent, "text");
      this.text = text;
   }

   public Text<Z> addAttr(Attribute var1) {
      throw new UnsupportedOperationException("Text element can't contain attributes.");
   }

   public Element addChild(Element var1) {
      throw new UnsupportedOperationException("Text element can't contain children.");
   }

   public Text<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public String getValue() {
      return this.text;
   }

   public Text<Z> cloneElem() {
      return (Text)this.clone(new Text());
   }
}

package org.xmlet.htmlapi;

public class Comment<Z extends Element> extends AbstractElement<Comment<Z>, Z> {
   private String text;

   public Comment() {
      super("text");
   }

   public Comment(Z parent, String text) {
      super(parent, "text");
      this.text = text;
   }

   public Comment<Z> addAttr(Attribute var1) {
      throw new UnsupportedOperationException("Text element can't contain attributes.");
   }

   public Element addChild(Element var1) {
      throw new UnsupportedOperationException("Text element can't contain children.");
   }

   public Comment<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public String getValue() {
      return this.text;
   }

   public Comment<Z> cloneElem() {
      return (Comment)this.clone(new Comment());
   }
}

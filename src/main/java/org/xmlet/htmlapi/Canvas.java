package org.xmlet.htmlapi;

public class Canvas<Z extends Element> extends AbstractElement<Canvas<Z>, Z> implements CommonAttributeGroup<Canvas<Z>, Z>, TextGroup<Canvas<Z>, Z> {
   public Canvas() {
      super("canvas");
   }

   public Canvas(String name) {
      super(name);
   }

   public Canvas(Z parent) {
      super(parent, "canvas");
   }

   public Canvas(Z parent, String name) {
      super(parent, name);
   }

   public Canvas<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Canvas<Z> cloneElem() {
      return (Canvas)this.clone(new Canvas());
   }

   public Canvas<Z> attrWidth(java.lang.Object attrWidth) {
      return (Canvas)this.addAttr(new AttrWidthObject(attrWidth));
   }

   public Canvas<Z> attrHeight(java.lang.Object attrHeight) {
      return (Canvas)this.addAttr(new AttrHeightObject(attrHeight));
   }
}

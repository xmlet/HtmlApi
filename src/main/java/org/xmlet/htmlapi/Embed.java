package org.xmlet.htmlapi;

public class Embed<Z extends Element> extends AbstractElement<Embed<Z>, Z> implements CommonAttributeGroup<Embed<Z>, Z>, TextGroup<Embed<Z>, Z> {
   public Embed() {
      super("embed");
   }

   public Embed(String name) {
      super(name);
   }

   public Embed(Z parent) {
      super(parent, "embed");
   }

   public Embed(Z parent, String name) {
      super(parent, name);
   }

   public Embed<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Embed<Z> cloneElem() {
      return (Embed)this.clone(new Embed());
   }

   public Embed<Z> attrSrc(String attrSrc) {
      return (Embed)this.addAttr(new AttrSrcString(attrSrc));
   }

   public Embed<Z> attrHeight(java.lang.Object attrHeight) {
      return (Embed)this.addAttr(new AttrHeightObject(attrHeight));
   }

   public Embed<Z> attrWidth(java.lang.Object attrWidth) {
      return (Embed)this.addAttr(new AttrWidthObject(attrWidth));
   }

   public Embed<Z> attrType(java.lang.Object attrType) {
      return (Embed)this.addAttr(new AttrTypeObject(attrType));
   }
}

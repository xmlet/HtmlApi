package org.xmlet.htmlapi;

public class Source<Z extends Element> extends AbstractElement<Source<Z>, Z> implements CommonAttributeGroup<Source<Z>, Z>, TextGroup<Source<Z>, Z> {
   public Source() {
      super("source");
   }

   public Source(String name) {
      super(name);
   }

   public Source(Z parent) {
      super(parent, "source");
   }

   public Source(Z parent, String name) {
      super(parent, name);
   }

   public Source<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Source<Z> cloneElem() {
      return (Source)this.clone(new Source());
   }

   public Source<Z> attrSrc(String attrSrc) {
      return (Source)this.addAttr(new AttrSrcString(attrSrc));
   }

   public Source<Z> attrType(java.lang.Object attrType) {
      return (Source)this.addAttr(new AttrTypeObject(attrType));
   }

   public Source<Z> attrMedia(java.lang.Object attrMedia) {
      return (Source)this.addAttr(new AttrMediaObject(attrMedia));
   }
}

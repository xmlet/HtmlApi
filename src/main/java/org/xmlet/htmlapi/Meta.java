package org.xmlet.htmlapi;

public class Meta<Z extends Element> extends AbstractElement<Meta<Z>, Z> implements CommonAttributeGroup<Meta<Z>, Z>, TextGroup<Meta<Z>, Z> {
   public Meta() {
      super("meta");
   }

   public Meta(String name) {
      super(name);
   }

   public Meta(Z parent) {
      super(parent, "meta");
   }

   public Meta(Z parent, String name) {
      super(parent, name);
   }

   public Meta<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Meta<Z> cloneElem() {
      return (Meta)this.clone(new Meta());
   }

   public Meta<Z> attrHttpEquiv(EnumHttpEquivMeta attrHttpEquiv) {
      return (Meta)this.addAttr(new AttrHttpEquivEnumHttpEquivMeta(attrHttpEquiv));
   }

   public Meta<Z> attrName(java.lang.Object attrName) {
      return (Meta)this.addAttr(new AttrNameObject(attrName));
   }

   public Meta<Z> attrContent(java.lang.Object attrContent) {
      return (Meta)this.addAttr(new AttrContentObject(attrContent));
   }

   public Meta<Z> attrCharset(java.lang.Object attrCharset) {
      return (Meta)this.addAttr(new AttrCharsetObject(attrCharset));
   }
}

package org.xmlet.htmlapi;

public class A<Z extends Element> extends AbstractElement<A<Z>, Z> implements CommonAttributeGroup<A<Z>, Z>, FlowContentChoice<A<Z>, Z> {
   public A() {
      super("a");
   }

   public A(String name) {
      super(name);
   }

   public A(Z parent) {
      super(parent, "a");
   }

   public A(Z parent, String name) {
      super(parent, name);
   }

   public A<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public A<Z> cloneElem() {
      return (A)this.clone(new A());
   }

   public A<Z> attrHref(String attrHref) {
      return (A)this.addAttr(new AttrHrefString(attrHref));
   }

   public A<Z> attrTarget(EnumTargetBrowsingContext attrTarget) {
      return (A)this.addAttr(new AttrTargetEnumTargetBrowsingContext(attrTarget));
   }

   public A<Z> attrPing(java.lang.Object attrPing) {
      return (A)this.addAttr(new AttrPingObject(attrPing));
   }

   public A<Z> attrRel(EnumRelLinkType attrRel) {
      return (A)this.addAttr(new AttrRelEnumRelLinkType(attrRel));
   }

   public A<Z> attrMedia(java.lang.Object attrMedia) {
      return (A)this.addAttr(new AttrMediaObject(attrMedia));
   }

   public A<Z> attrHreflang(java.lang.Object attrHreflang) {
      return (A)this.addAttr(new AttrHreflangObject(attrHreflang));
   }

   public A<Z> attrType(EnumTypeSimpleContentType attrType) {
      return (A)this.addAttr(new AttrTypeEnumTypeSimpleContentType(attrType));
   }
}

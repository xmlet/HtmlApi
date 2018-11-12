package org.xmlet.htmlapi;

public class Base<Z extends Element> extends AbstractElement<Base<Z>, Z> implements CommonAttributeGroup<Base<Z>, Z>, TextGroup<Base<Z>, Z> {
   public Base() {
      super("base");
   }

   public Base(String name) {
      super(name);
   }

   public Base(Z parent) {
      super(parent, "base");
   }

   public Base(Z parent, String name) {
      super(parent, name);
   }

   public Base<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Base<Z> cloneElem() {
      return (Base)this.clone(new Base());
   }

   public Base<Z> attrHref(String attrHref) {
      return (Base)this.addAttr(new AttrHrefString(attrHref));
   }

   public Base<Z> attrTarget(EnumTargetBrowsingContext attrTarget) {
      return (Base)this.addAttr(new AttrTargetEnumTargetBrowsingContext(attrTarget));
   }
}

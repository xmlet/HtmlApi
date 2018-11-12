package org.xmlet.htmlapi;

public class Th<Z extends Element> extends AbstractElement<Th<Z>, Z> implements CommonAttributeGroup<Th<Z>, Z>, PhrasingContentChoice<Th<Z>, Z> {
   public Th() {
      super("th");
   }

   public Th(String name) {
      super(name);
   }

   public Th(Z parent) {
      super(parent, "th");
   }

   public Th(Z parent, String name) {
      super(parent, name);
   }

   public Th<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Th<Z> cloneElem() {
      return (Th)this.clone(new Th());
   }

   public Th<Z> attrHeaders(java.lang.Object attrHeaders) {
      return (Th)this.addAttr(new AttrHeadersObject(attrHeaders));
   }

   public Th<Z> attrRowspan(java.lang.Object attrRowspan) {
      return (Th)this.addAttr(new AttrRowspanObject(attrRowspan));
   }

   public Th<Z> attrColspan(java.lang.Object attrColspan) {
      return (Th)this.addAttr(new AttrColspanObject(attrColspan));
   }

   public Th<Z> attrScope(EnumScopeTh attrScope) {
      return (Th)this.addAttr(new AttrScopeEnumScopeTh(attrScope));
   }
}

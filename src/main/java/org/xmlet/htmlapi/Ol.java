package org.xmlet.htmlapi;

public class Ol<Z extends Element> extends AbstractElement<Ol<Z>, Z> implements CommonAttributeGroup<Ol<Z>, Z>, OlChoice0<Ol<Z>, Z> {
   public Ol() {
      super("ol");
   }

   public Ol(String name) {
      super(name);
   }

   public Ol(Z parent) {
      super(parent, "ol");
   }

   public Ol(Z parent, String name) {
      super(parent, name);
   }

   public Ol<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Ol<Z> cloneElem() {
      return (Ol)this.clone(new Ol());
   }

   public Ol<Z> attrStart(java.lang.Object attrStart) {
      return (Ol)this.addAttr(new AttrStartObject(attrStart));
   }

   public Ol<Z> attrReversed(EnumReversedOl attrReversed) {
      return (Ol)this.addAttr(new AttrReversedEnumReversedOl(attrReversed));
   }
}

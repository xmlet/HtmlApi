package org.xmlet.htmlapi;

public class Td<Z extends Element> extends AbstractElement<Td<Z>, Z> implements CommonAttributeGroup<Td<Z>, Z>, FlowContentChoice<Td<Z>, Z> {
   public Td() {
      super("td");
   }

   public Td(String name) {
      super(name);
   }

   public Td(Z parent) {
      super(parent, "td");
   }

   public Td(Z parent, String name) {
      super(parent, name);
   }

   public Td<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Td<Z> cloneElem() {
      return (Td)this.clone(new Td());
   }

   public Td<Z> attrHeaders(java.lang.Object attrHeaders) {
      return (Td)this.addAttr(new AttrHeadersObject(attrHeaders));
   }

   public Td<Z> attrRowspan(java.lang.Object attrRowspan) {
      return (Td)this.addAttr(new AttrRowspanObject(attrRowspan));
   }

   public Td<Z> attrColspan(java.lang.Object attrColspan) {
      return (Td)this.addAttr(new AttrColspanObject(attrColspan));
   }
}

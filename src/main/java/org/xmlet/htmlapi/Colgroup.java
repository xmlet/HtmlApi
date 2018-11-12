package org.xmlet.htmlapi;

import java.math.BigInteger;

public class Colgroup<Z extends Element> extends AbstractElement<Colgroup<Z>, Z> implements CommonAttributeGroup<Colgroup<Z>, Z>, ColgroupChoice0<Colgroup<Z>, Z> {
   public Colgroup() {
      super("colgroup");
   }

   public Colgroup(String name) {
      super(name);
   }

   public Colgroup(Z parent) {
      super(parent, "colgroup");
   }

   public Colgroup(Z parent, String name) {
      super(parent, name);
   }

   public Colgroup<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Colgroup<Z> cloneElem() {
      return (Colgroup)this.clone(new Colgroup());
   }

   public Colgroup<Z> attrSpan(BigInteger attrSpan) {
      return (Colgroup)this.addAttr(new AttrSpanBigInteger(attrSpan));
   }
}

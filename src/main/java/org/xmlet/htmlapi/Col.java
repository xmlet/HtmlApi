package org.xmlet.htmlapi;

import java.math.BigInteger;

public class Col<Z extends Element> extends AbstractElement<Col<Z>, Z> implements CommonAttributeGroup<Col<Z>, Z>, TextGroup<Col<Z>, Z> {
   public Col() {
      super("col");
   }

   public Col(String name) {
      super(name);
   }

   public Col(Z parent) {
      super(parent, "col");
   }

   public Col(Z parent, String name) {
      super(parent, name);
   }

   public Col<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Col<Z> cloneElem() {
      return (Col)this.clone(new Col());
   }

   public Col<Z> attrSpan(BigInteger attrSpan) {
      return (Col)this.addAttr(new AttrSpanBigInteger(attrSpan));
   }
}

package org.xmlet.htmlapi;

public class Details<Z extends Element> extends AbstractElement<Details<Z>, Z> implements CommonAttributeGroup<Details<Z>, Z>, DetailsChoice0<Details<Z>, Z> {
   public Details() {
      super("details");
   }

   public Details(String name) {
      super(name);
   }

   public Details(Z parent) {
      super(parent, "details");
   }

   public Details(Z parent, String name) {
      super(parent, name);
   }

   public Details<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Details<Z> cloneElem() {
      return (Details)this.clone(new Details());
   }

   public Details<Z> attrOpen(EnumOpenDetails attrOpen) {
      return (Details)this.addAttr(new AttrOpenEnumOpenDetails(attrOpen));
   }
}

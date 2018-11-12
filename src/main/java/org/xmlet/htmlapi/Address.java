package org.xmlet.htmlapi;

public class Address<Z extends Element> extends AbstractElement<Address<Z>, Z> implements CommonAttributeGroup<Address<Z>, Z>, FlowContentChoice<Address<Z>, Z> {
   public Address() {
      super("address");
   }

   public Address(String name) {
      super(name);
   }

   public Address(Z parent) {
      super(parent, "address");
   }

   public Address(Z parent, String name) {
      super(parent, name);
   }

   public Address<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Address<Z> cloneElem() {
      return (Address)this.clone(new Address());
   }
}

package org.xmlet.htmlapi;

public class Mathml<Z extends Element> extends AbstractElement<Mathml<Z>, Z> implements CommonAttributeGroup<Mathml<Z>, Z>, TextGroup<Mathml<Z>, Z> {
   public Mathml() {
      super("mathml");
   }

   public Mathml(String name) {
      super(name);
   }

   public Mathml(Z parent) {
      super(parent, "mathml");
   }

   public Mathml(Z parent, String name) {
      super(parent, name);
   }

   public Mathml<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Mathml<Z> cloneElem() {
      return (Mathml)this.clone(new Mathml());
   }
}

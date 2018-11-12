package org.xmlet.htmlapi;

public class Hgroup<Z extends Element> extends AbstractElement<Hgroup<Z>, Z> implements CommonAttributeGroup<Hgroup<Z>, Z>, HgroupChoice0<Hgroup<Z>, Z> {
   public Hgroup() {
      super("hgroup");
   }

   public Hgroup(String name) {
      super(name);
   }

   public Hgroup(Z parent) {
      super(parent, "hgroup");
   }

   public Hgroup(Z parent, String name) {
      super(parent, name);
   }

   public Hgroup<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Hgroup<Z> cloneElem() {
      return (Hgroup)this.clone(new Hgroup());
   }
}

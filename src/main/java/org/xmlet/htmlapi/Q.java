package org.xmlet.htmlapi;

public class Q<Z extends Element> extends AbstractElement<Q<Z>, Z> implements CommonAttributeGroup<Q<Z>, Z>, PhrasingContentChoice<Q<Z>, Z> {
   public Q() {
      super("q");
   }

   public Q(String name) {
      super(name);
   }

   public Q(Z parent) {
      super(parent, "q");
   }

   public Q(Z parent, String name) {
      super(parent, name);
   }

   public Q<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Q<Z> cloneElem() {
      return (Q)this.clone(new Q());
   }

   public Q<Z> attrCite(String attrCite) {
      return (Q)this.addAttr(new AttrCiteString(attrCite));
   }
}

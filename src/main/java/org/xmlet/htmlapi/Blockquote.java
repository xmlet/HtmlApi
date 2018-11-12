package org.xmlet.htmlapi;

public class Blockquote<Z extends Element> extends AbstractElement<Blockquote<Z>, Z> implements CommonAttributeGroup<Blockquote<Z>, Z>, FlowContentChoice<Blockquote<Z>, Z> {
   public Blockquote() {
      super("blockquote");
   }

   public Blockquote(String name) {
      super(name);
   }

   public Blockquote(Z parent) {
      super(parent, "blockquote");
   }

   public Blockquote(Z parent, String name) {
      super(parent, name);
   }

   public Blockquote<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Blockquote<Z> cloneElem() {
      return (Blockquote)this.clone(new Blockquote());
   }

   public Blockquote<Z> attrCite(String attrCite) {
      return (Blockquote)this.addAttr(new AttrCiteString(attrCite));
   }
}

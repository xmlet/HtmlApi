package org.xmlet.htmlapi;

public class Title<Z extends Element> extends AbstractElement<Title<Z>, Z> implements CommonAttributeGroup<Title<Z>, Z>, TextGroup<Title<Z>, Z> {
   public Title() {
      super("title");
   }

   public Title(String name) {
      super(name);
   }

   public Title(Z parent) {
      super(parent, "title");
   }

   public Title(Z parent, String name) {
      super(parent, name);
   }

   public Title<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Title<Z> cloneElem() {
      return (Title)this.clone(new Title());
   }
}

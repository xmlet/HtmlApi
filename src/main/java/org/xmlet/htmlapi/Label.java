package org.xmlet.htmlapi;

public class Label<Z extends Element> extends AbstractElement<Label<Z>, Z> implements CommonAttributeGroup<Label<Z>, Z>, PhrasingContentChoice<Label<Z>, Z> {
   public Label() {
      super("label");
   }

   public Label(String name) {
      super(name);
   }

   public Label(Z parent) {
      super(parent, "label");
   }

   public Label(Z parent, String name) {
      super(parent, name);
   }

   public Label<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Label<Z> cloneElem() {
      return (Label)this.clone(new Label());
   }

   public Label<Z> attrForm(java.lang.Object attrForm) {
      return (Label)this.addAttr(new AttrFormObject(attrForm));
   }

   public Label<Z> attrFor(java.lang.Object attrFor) {
      return (Label)this.addAttr(new AttrForObject(attrFor));
   }
}

package org.xmlet.htmlapi;

public class Fieldset<Z extends Element> extends AbstractElement<Fieldset<Z>, Z> implements CommonAttributeGroup<Fieldset<Z>, Z>, FieldsetChoice0<Fieldset<Z>, Z> {
   public Fieldset() {
      super("fieldset");
   }

   public Fieldset(String name) {
      super(name);
   }

   public Fieldset(Z parent) {
      super(parent, "fieldset");
   }

   public Fieldset(Z parent, String name) {
      super(parent, name);
   }

   public Fieldset<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Fieldset<Z> cloneElem() {
      return (Fieldset)this.clone(new Fieldset());
   }

   public Fieldset<Z> attrDisabled(java.lang.Object attrDisabled) {
      return (Fieldset)this.addAttr(new AttrDisabledObject(attrDisabled));
   }

   public Fieldset<Z> attrForm(java.lang.Object attrForm) {
      return (Fieldset)this.addAttr(new AttrFormObject(attrForm));
   }

   public Fieldset<Z> attrName(java.lang.Object attrName) {
      return (Fieldset)this.addAttr(new AttrNameObject(attrName));
   }
}

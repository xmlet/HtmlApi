package org.xmlet.htmlapi;

public class Option<Z extends Element> extends AbstractElement<Option<Z>, Z> implements CommonAttributeGroup<Option<Z>, Z>, TextGroup<Option<Z>, Z> {
   public Option() {
      super("option");
   }

   public Option(String name) {
      super(name);
   }

   public Option(Z parent) {
      super(parent, "option");
   }

   public Option(Z parent, String name) {
      super(parent, name);
   }

   public Option<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Option<Z> cloneElem() {
      return (Option)this.clone(new Option());
   }

   public Option<Z> attrDisabled(EnumDisabledOption attrDisabled) {
      return (Option)this.addAttr(new AttrDisabledEnumDisabledOption(attrDisabled));
   }

   public Option<Z> attrSelected(EnumSelectedOption attrSelected) {
      return (Option)this.addAttr(new AttrSelectedEnumSelectedOption(attrSelected));
   }

   public Option<Z> attrLabel(java.lang.Object attrLabel) {
      return (Option)this.addAttr(new AttrLabelObject(attrLabel));
   }

   public Option<Z> attrValue(java.lang.Object attrValue) {
      return (Option)this.addAttr(new AttrValueObject(attrValue));
   }
}

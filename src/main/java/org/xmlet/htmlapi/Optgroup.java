package org.xmlet.htmlapi;

public class Optgroup<Z extends Element> extends AbstractElement<Optgroup<Z>, Z> implements CommonAttributeGroup<Optgroup<Z>, Z>, OptgroupChoice0<Optgroup<Z>, Z> {
   public Optgroup() {
      super("optgroup");
   }

   public Optgroup(String name) {
      super(name);
   }

   public Optgroup(Z parent) {
      super(parent, "optgroup");
   }

   public Optgroup(Z parent, String name) {
      super(parent, name);
   }

   public Optgroup<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Optgroup<Z> cloneElem() {
      return (Optgroup)this.clone(new Optgroup());
   }

   public Optgroup<Z> attrDisabled(EnumDisabledOptgroup attrDisabled) {
      return (Optgroup)this.addAttr(new AttrDisabledEnumDisabledOptgroup(attrDisabled));
   }

   public Optgroup<Z> attrLabel(java.lang.Object attrLabel) {
      return (Optgroup)this.addAttr(new AttrLabelObject(attrLabel));
   }
}

package org.xmlet.htmlapi;

public class Command<Z extends Element> extends AbstractElement<Command<Z>, Z> implements CommonAttributeGroup<Command<Z>, Z>, TextGroup<Command<Z>, Z> {
   public Command() {
      super("command");
   }

   public Command(String name) {
      super(name);
   }

   public Command(Z parent) {
      super(parent, "command");
   }

   public Command(Z parent, String name) {
      super(parent, name);
   }

   public Command<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Command<Z> cloneElem() {
      return (Command)this.clone(new Command());
   }

   public Command<Z> attrType(EnumTypeCommand attrType) {
      return (Command)this.addAttr(new AttrTypeEnumTypeCommand(attrType));
   }

   public Command<Z> attrLabel(java.lang.Object attrLabel) {
      return (Command)this.addAttr(new AttrLabelObject(attrLabel));
   }

   public Command<Z> attrIcon(java.lang.Object attrIcon) {
      return (Command)this.addAttr(new AttrIconObject(attrIcon));
   }

   public Command<Z> attrDisabled(EnumDisabledCommand attrDisabled) {
      return (Command)this.addAttr(new AttrDisabledEnumDisabledCommand(attrDisabled));
   }

   public Command<Z> attrChecked(EnumCheckedCommand attrChecked) {
      return (Command)this.addAttr(new AttrCheckedEnumCheckedCommand(attrChecked));
   }

   public Command<Z> attrRadiogroup(java.lang.Object attrRadiogroup) {
      return (Command)this.addAttr(new AttrRadiogroupObject(attrRadiogroup));
   }
}

package org.xmlet.htmlapi;

public class Script<Z extends Element> extends AbstractElement<Script<Z>, Z> implements CoreAttributeGroup<Script<Z>, Z>, TextGroup<Script<Z>, Z> {
   public Script() {
      super("script");
   }

   public Script(String name) {
      super(name);
   }

   public Script(Z parent) {
      super(parent, "script");
   }

   public Script(Z parent, String name) {
      super(parent, name);
   }

   public Script<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Script<Z> cloneElem() {
      return (Script)this.clone(new Script());
   }

   public Script<Z> attrCharset(String attrCharset) {
      return (Script)this.addAttr(new AttrCharsetString(attrCharset));
   }

   public Script<Z> attrType(EnumTypeScript attrType) {
      return (Script)this.addAttr(new AttrTypeEnumTypeScript(attrType));
   }

   public Script<Z> attrSrc(String attrSrc) {
      return (Script)this.addAttr(new AttrSrcString(attrSrc));
   }

   public Script<Z> attrDefer(EnumDeferScript attrDefer) {
      return (Script)this.addAttr(new AttrDeferEnumDeferScript(attrDefer));
   }

   public Script<Z> attrAsync(EnumAsyncScript attrAsync) {
      return (Script)this.addAttr(new AttrAsyncEnumAsyncScript(attrAsync));
   }
}

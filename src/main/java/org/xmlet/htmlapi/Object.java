package org.xmlet.htmlapi;

public class Object<Z extends Element> extends AbstractElement<Object<Z>, Z> implements CommonAttributeGroup<Object<Z>, Z>, ObjectChoice0<Object<Z>, Z> {
   public Object() {
      super("object");
   }

   public Object(String name) {
      super(name);
   }

   public Object(Z parent) {
      super(parent, "object");
   }

   public Object(Z parent, String name) {
      super(parent, name);
   }

   public Object<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Object<Z> cloneElem() {
      return (Object)this.clone(new Object());
   }

   public Object<Z> attrData(String attrData) {
      return (Object)this.addAttr(new AttrDataString(attrData));
   }

   public Object<Z> attrType(java.lang.Object attrType) {
      return (Object)this.addAttr(new AttrTypeObject(attrType));
   }

   public Object<Z> attrHeight(java.lang.Object attrHeight) {
      return (Object)this.addAttr(new AttrHeightObject(attrHeight));
   }

   public Object<Z> attrWidth(java.lang.Object attrWidth) {
      return (Object)this.addAttr(new AttrWidthObject(attrWidth));
   }

   public Object<Z> attrUsemap(String attrUsemap) {
      return (Object)this.addAttr(new AttrUsemapString(attrUsemap));
   }

   public Object<Z> attrName(EnumNameBrowsingContext attrName) {
      return (Object)this.addAttr(new AttrNameEnumNameBrowsingContext(attrName));
   }

   public Object<Z> attrForm(java.lang.Object attrForm) {
      return (Object)this.addAttr(new AttrFormObject(attrForm));
   }

   public Object<Z> attrClassid(java.lang.Object attrClassid) {
      return (Object)this.addAttr(new AttrClassidObject(attrClassid));
   }
}

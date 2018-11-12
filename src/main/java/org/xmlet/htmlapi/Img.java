package org.xmlet.htmlapi;

public class Img<Z extends Element> extends AbstractElement<Img<Z>, Z> implements CommonAttributeGroup<Img<Z>, Z>, TextGroup<Img<Z>, Z> {
   public Img() {
      super("img");
   }

   public Img(String name) {
      super(name);
   }

   public Img(Z parent) {
      super(parent, "img");
   }

   public Img(Z parent, String name) {
      super(parent, name);
   }

   public Img<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Img<Z> cloneElem() {
      return (Img)this.clone(new Img());
   }

   public Img<Z> attrAlt(java.lang.Object attrAlt) {
      return (Img)this.addAttr(new AttrAltObject(attrAlt));
   }

   public Img<Z> attrSrc(String attrSrc) {
      return (Img)this.addAttr(new AttrSrcString(attrSrc));
   }

   public Img<Z> attrHeight(java.lang.Object attrHeight) {
      return (Img)this.addAttr(new AttrHeightObject(attrHeight));
   }

   public Img<Z> attrWidth(java.lang.Object attrWidth) {
      return (Img)this.addAttr(new AttrWidthObject(attrWidth));
   }

   public Img<Z> attrUsemap(String attrUsemap) {
      return (Img)this.addAttr(new AttrUsemapString(attrUsemap));
   }

   public Img<Z> attrIsmap(EnumIsmapImg attrIsmap) {
      return (Img)this.addAttr(new AttrIsmapEnumIsmapImg(attrIsmap));
   }
}

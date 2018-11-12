package org.xmlet.htmlapi;

public class Link<Z extends Element> extends AbstractElement<Link<Z>, Z> implements CommonAttributeGroup<Link<Z>, Z>, TextGroup<Link<Z>, Z> {
   public Link() {
      super("link");
   }

   public Link(String name) {
      super(name);
   }

   public Link(Z parent) {
      super(parent, "link");
   }

   public Link(Z parent, String name) {
      super(parent, name);
   }

   public Link<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Link<Z> cloneElem() {
      return (Link)this.clone(new Link());
   }

   public Link<Z> attrHref(String attrHref) {
      return (Link)this.addAttr(new AttrHrefString(attrHref));
   }

   public Link<Z> attrHreflang(java.lang.Object attrHreflang) {
      return (Link)this.addAttr(new AttrHreflangObject(attrHreflang));
   }

   public Link<Z> attrRel(EnumRelLinkType attrRel) {
      return (Link)this.addAttr(new AttrRelEnumRelLinkType(attrRel));
   }

   public Link<Z> attrMedia(EnumMediaMediaType attrMedia) {
      return (Link)this.addAttr(new AttrMediaEnumMediaMediaType(attrMedia));
   }

   public Link<Z> attrType(EnumTypeContentType attrType) {
      return (Link)this.addAttr(new AttrTypeEnumTypeContentType(attrType));
   }

   public Link<Z> attrSizes(java.lang.Object attrSizes) {
      return (Link)this.addAttr(new AttrSizesObject(attrSizes));
   }
}

package org.xmlet.htmlapi;

public class Area<Z extends Element> extends AbstractElement<Area<Z>, Z> implements CommonAttributeGroup<Area<Z>, Z>, TextGroup<Area<Z>, Z> {
   public Area() {
      super("area");
   }

   public Area(String name) {
      super(name);
   }

   public Area(Z parent) {
      super(parent, "area");
   }

   public Area(Z parent, String name) {
      super(parent, name);
   }

   public Area<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Area<Z> cloneElem() {
      return (Area)this.clone(new Area());
   }

   public Area<Z> attrShape(EnumShapeArea attrShape) {
      return (Area)this.addAttr(new AttrShapeEnumShapeArea(attrShape));
   }

   public Area<Z> attrCoords(java.lang.Object attrCoords) {
      return (Area)this.addAttr(new AttrCoordsObject(attrCoords));
   }

   public Area<Z> attrHref(String attrHref) {
      return (Area)this.addAttr(new AttrHrefString(attrHref));
   }

   public Area<Z> attrHreflang(java.lang.Object attrHreflang) {
      return (Area)this.addAttr(new AttrHreflangObject(attrHreflang));
   }

   public Area<Z> attrAlt(java.lang.Object attrAlt) {
      return (Area)this.addAttr(new AttrAltObject(attrAlt));
   }

   public Area<Z> attrTarget(EnumTargetBrowsingContext attrTarget) {
      return (Area)this.addAttr(new AttrTargetEnumTargetBrowsingContext(attrTarget));
   }

   public Area<Z> attrMedia(java.lang.Object attrMedia) {
      return (Area)this.addAttr(new AttrMediaObject(attrMedia));
   }

   public Area<Z> attrRel(EnumRelLinkType attrRel) {
      return (Area)this.addAttr(new AttrRelEnumRelLinkType(attrRel));
   }

   public Area<Z> attrPing(java.lang.Object attrPing) {
      return (Area)this.addAttr(new AttrPingObject(attrPing));
   }

   public Area<Z> attrType(java.lang.Object attrType) {
      return (Area)this.addAttr(new AttrTypeObject(attrType));
   }
}

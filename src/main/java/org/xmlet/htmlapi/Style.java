package org.xmlet.htmlapi;

public class Style<Z extends Element> extends AbstractElement<Style<Z>, Z> implements CommonAttributeGroup<Style<Z>, Z>, TextGroup<Style<Z>, Z> {
   public Style() {
      super("style");
   }

   public Style(String name) {
      super(name);
   }

   public Style(Z parent) {
      super(parent, "style");
   }

   public Style(Z parent, String name) {
      super(parent, name);
   }

   public Style<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Style<Z> cloneElem() {
      return (Style)this.clone(new Style());
   }

   public Style<Z> attrType(EnumTypeStyle attrType) {
      return (Style)this.addAttr(new AttrTypeEnumTypeStyle(attrType));
   }

   public Style<Z> attrMedia(EnumMediaMediaType attrMedia) {
      return (Style)this.addAttr(new AttrMediaEnumMediaMediaType(attrMedia));
   }

   public Style<Z> attrScoped(EnumScopedStyle attrScoped) {
      return (Style)this.addAttr(new AttrScopedEnumScopedStyle(attrScoped));
   }
}

package org.xmlet.htmlapi;

public class Audio<Z extends Element> extends AbstractElement<Audio<Z>, Z> implements CommonAttributeGroup<Audio<Z>, Z>, AudioChoice0<Audio<Z>, Z> {
   public Audio() {
      super("audio");
   }

   public Audio(String name) {
      super(name);
   }

   public Audio(Z parent) {
      super(parent, "audio");
   }

   public Audio(Z parent, String name) {
      super(parent, name);
   }

   public Audio<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Audio<Z> cloneElem() {
      return (Audio)this.clone(new Audio());
   }

   public Audio<Z> attrSrc(String attrSrc) {
      return (Audio)this.addAttr(new AttrSrcString(attrSrc));
   }

   public Audio<Z> attrAutobuffer(EnumAutobufferAudio attrAutobuffer) {
      return (Audio)this.addAttr(new AttrAutobufferEnumAutobufferAudio(attrAutobuffer));
   }

   public Audio<Z> attrAutoplay(EnumAutoplayAudio attrAutoplay) {
      return (Audio)this.addAttr(new AttrAutoplayEnumAutoplayAudio(attrAutoplay));
   }

   public Audio<Z> attrLoop(EnumLoopAudio attrLoop) {
      return (Audio)this.addAttr(new AttrLoopEnumLoopAudio(attrLoop));
   }

   public Audio<Z> attrControls(EnumControlsAudio attrControls) {
      return (Audio)this.addAttr(new AttrControlsEnumControlsAudio(attrControls));
   }
}

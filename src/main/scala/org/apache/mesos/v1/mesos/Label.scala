// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

/** *
  * Key, value pair used to store free form user-data.
  */
@SerialVersionUID(0L)
final case class Label(
    key: String,
    value: scala.Option[String] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Label] with com.trueaccord.lenses.Updatable[Label] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, key)
      if (value.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, value.get) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      _output__.writeString(1, key)
      value.foreach { __v =>
        _output__.writeString(2, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.Label = {
      var __key = this.key
      var __value = this.value
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __key = _input__.readString()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 18 =>
            __value = Some(_input__.readString())
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      org.apache.mesos.v1.mesos.Label(
          key = __key,
          value = __value
      )
    }
    def withKey(__v: String): Label = copy(key = __v)
    def getValue: String = value.getOrElse("")
    def clearValue: Label = copy(value = None)
    def withValue(__v: String): Label = copy(value = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => key
        case 2 => value.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(key)
        case 2 => value.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.Label
}

object Label extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Label] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Label] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.Label = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.Label(
      __fieldsMap(__fields.get(0)).asInstanceOf[String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.Label] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.Label(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[String],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(64)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(64)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.apache.mesos.v1.mesos.Label(
    key = ""
  )
  implicit class LabelLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Label]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.Label](_l) {
    def key: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.key)((c_, f_) => c_.copy(key = f_))
    def value: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getValue)((c_, f_) => c_.copy(value = Some(f_)))
    def optionalValue: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val KEY_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
}
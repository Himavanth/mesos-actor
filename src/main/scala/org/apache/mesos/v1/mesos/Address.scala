// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

/** *
  * A network address.
  *
  * TODO(bmahler): Use this more widely.
  *
  * @param hostname
  *   May contain a hostname, IP address, or both.
  */
@SerialVersionUID(0L)
final case class Address(
    hostname: scala.Option[String] = None,
    ip: scala.Option[String] = None,
    port: Int
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Address] with com.trueaccord.lenses.Updatable[Address] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (hostname.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, hostname.get) }
      if (ip.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, ip.get) }
      __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, port)
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
      hostname.foreach { __v =>
        _output__.writeString(1, __v)
      };
      ip.foreach { __v =>
        _output__.writeString(2, __v)
      };
      _output__.writeInt32(3, port)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.Address = {
      var __hostname = this.hostname
      var __ip = this.ip
      var __port = this.port
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __hostname = Some(_input__.readString())
          case 18 =>
            __ip = Some(_input__.readString())
          case 24 =>
            __port = _input__.readInt32()
            __requiredFields0 &= 0xfffffffffffffffeL
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      org.apache.mesos.v1.mesos.Address(
          hostname = __hostname,
          ip = __ip,
          port = __port
      )
    }
    def getHostname: String = hostname.getOrElse("")
    def clearHostname: Address = copy(hostname = None)
    def withHostname(__v: String): Address = copy(hostname = Some(__v))
    def getIp: String = ip.getOrElse("")
    def clearIp: Address = copy(ip = None)
    def withIp(__v: String): Address = copy(ip = Some(__v))
    def withPort(__v: Int): Address = copy(port = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => hostname.orNull
        case 2 => ip.orNull
        case 3 => port
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => hostname.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => ip.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PInt(port)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.Address
}

object Address extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Address] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Address] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.Address = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.Address(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]],
      __fieldsMap(__fields.get(2)).asInstanceOf[Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.Address] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.Address(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).get.as[Int]
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(9)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(9)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.apache.mesos.v1.mesos.Address(
    port = 0
  )
  implicit class AddressLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Address]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.Address](_l) {
    def hostname: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getHostname)((c_, f_) => c_.copy(hostname = Some(f_)))
    def optionalHostname: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.hostname)((c_, f_) => c_.copy(hostname = f_))
    def ip: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getIp)((c_, f_) => c_.copy(ip = Some(f_)))
    def optionalIp: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.ip)((c_, f_) => c_.copy(ip = f_))
    def port: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.port)((c_, f_) => c_.copy(port = f_))
  }
  final val HOSTNAME_FIELD_NUMBER = 1
  final val IP_FIELD_NUMBER = 2
  final val PORT_FIELD_NUMBER = 3
}
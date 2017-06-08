// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

/** *
  * Credentials used for framework authentication, HTTP authentication
  * (where the common 'username' and 'password' are captured as
  * 'principal' and 'secret' respectively), etc.
  */
@SerialVersionUID(0L)
final case class Credentials(
    credentials: _root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Credential] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Credentials] with com.trueaccord.lenses.Updatable[Credentials] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      credentials.foreach(credentials => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(credentials.serializedSize) + credentials.serializedSize)
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
      credentials.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.Credentials = {
      val __credentials = (_root_.scala.collection.immutable.Vector.newBuilder[org.apache.mesos.v1.mesos.Credential] ++= this.credentials)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __credentials += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, org.apache.mesos.v1.mesos.Credential.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      org.apache.mesos.v1.mesos.Credentials(
          credentials = __credentials.result()
      )
    }
    def clearCredentials = copy(credentials = _root_.scala.collection.Seq.empty)
    def addCredentials(__vs: org.apache.mesos.v1.mesos.Credential*): Credentials = addAllCredentials(__vs)
    def addAllCredentials(__vs: TraversableOnce[org.apache.mesos.v1.mesos.Credential]): Credentials = copy(credentials = credentials ++ __vs)
    def withCredentials(__v: _root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Credential]): Credentials = copy(credentials = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => credentials
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(credentials.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.Credentials
}

object Credentials extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Credentials] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Credentials] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.Credentials = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.Credentials(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Credential]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.Credentials] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.Credentials(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Credential]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(49)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(49)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = org.apache.mesos.v1.mesos.Credential
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.apache.mesos.v1.mesos.Credentials(
  )
  implicit class CredentialsLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Credentials]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.Credentials](_l) {
    def credentials: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Credential]] = field(_.credentials)((c_, f_) => c_.copy(credentials = f_))
  }
  final val CREDENTIALS_FIELD_NUMBER = 1
}
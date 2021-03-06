/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package sr.rpc.bank;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-04-30")
public class Account implements org.apache.thrift.TBase<Account, Account._Fields>, java.io.Serializable, Cloneable, Comparable<Account> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Account");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SURNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("surname", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PESEL_FIELD_DESC = new org.apache.thrift.protocol.TField("pesel", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField INCOME_FIELD_DESC = new org.apache.thrift.protocol.TField("income", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("currency", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField GUID_FIELD_DESC = new org.apache.thrift.protocol.TField("guid", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AccountStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AccountTupleSchemeFactory();

  public java.lang.String name; // required
  public java.lang.String surname; // required
  public java.lang.String pesel; // required
  public double income; // required
  public double amount; // required
  public java.lang.String currency; // required
  /**
   * 
   * @see AccountType
   */
  public AccountType type; // optional
  public java.lang.String guid; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    SURNAME((short)2, "surname"),
    PESEL((short)3, "pesel"),
    INCOME((short)4, "income"),
    AMOUNT((short)5, "amount"),
    CURRENCY((short)6, "currency"),
    /**
     * 
     * @see AccountType
     */
    TYPE((short)7, "type"),
    GUID((short)8, "guid");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // SURNAME
          return SURNAME;
        case 3: // PESEL
          return PESEL;
        case 4: // INCOME
          return INCOME;
        case 5: // AMOUNT
          return AMOUNT;
        case 6: // CURRENCY
          return CURRENCY;
        case 7: // TYPE
          return TYPE;
        case 8: // GUID
          return GUID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __INCOME_ISSET_ID = 0;
  private static final int __AMOUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.GUID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SURNAME, new org.apache.thrift.meta_data.FieldMetaData("surname", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PESEL, new org.apache.thrift.meta_data.FieldMetaData("pesel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INCOME, new org.apache.thrift.meta_data.FieldMetaData("income", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("currency", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, AccountType.class)));
    tmpMap.put(_Fields.GUID, new org.apache.thrift.meta_data.FieldMetaData("guid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Account.class, metaDataMap);
  }

  public Account() {
  }

  public Account(
    java.lang.String name,
    java.lang.String surname,
    java.lang.String pesel,
    double income,
    double amount,
    java.lang.String currency)
  {
    this();
    this.name = name;
    this.surname = surname;
    this.pesel = pesel;
    this.income = income;
    setIncomeIsSet(true);
    this.amount = amount;
    setAmountIsSet(true);
    this.currency = currency;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Account(Account other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetSurname()) {
      this.surname = other.surname;
    }
    if (other.isSetPesel()) {
      this.pesel = other.pesel;
    }
    this.income = other.income;
    this.amount = other.amount;
    if (other.isSetCurrency()) {
      this.currency = other.currency;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetGuid()) {
      this.guid = other.guid;
    }
  }

  public Account deepCopy() {
    return new Account(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.surname = null;
    this.pesel = null;
    setIncomeIsSet(false);
    this.income = 0.0;
    setAmountIsSet(false);
    this.amount = 0.0;
    this.currency = null;
    this.type = null;
    this.guid = null;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public Account setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getSurname() {
    return this.surname;
  }

  public Account setSurname(java.lang.String surname) {
    this.surname = surname;
    return this;
  }

  public void unsetSurname() {
    this.surname = null;
  }

  /** Returns true if field surname is set (has been assigned a value) and false otherwise */
  public boolean isSetSurname() {
    return this.surname != null;
  }

  public void setSurnameIsSet(boolean value) {
    if (!value) {
      this.surname = null;
    }
  }

  public java.lang.String getPesel() {
    return this.pesel;
  }

  public Account setPesel(java.lang.String pesel) {
    this.pesel = pesel;
    return this;
  }

  public void unsetPesel() {
    this.pesel = null;
  }

  /** Returns true if field pesel is set (has been assigned a value) and false otherwise */
  public boolean isSetPesel() {
    return this.pesel != null;
  }

  public void setPeselIsSet(boolean value) {
    if (!value) {
      this.pesel = null;
    }
  }

  public double getIncome() {
    return this.income;
  }

  public Account setIncome(double income) {
    this.income = income;
    setIncomeIsSet(true);
    return this;
  }

  public void unsetIncome() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INCOME_ISSET_ID);
  }

  /** Returns true if field income is set (has been assigned a value) and false otherwise */
  public boolean isSetIncome() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INCOME_ISSET_ID);
  }

  public void setIncomeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INCOME_ISSET_ID, value);
  }

  public double getAmount() {
    return this.amount;
  }

  public Account setAmount(double amount) {
    this.amount = amount;
    setAmountIsSet(true);
    return this;
  }

  public void unsetAmount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  public void setAmountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AMOUNT_ISSET_ID, value);
  }

  public java.lang.String getCurrency() {
    return this.currency;
  }

  public Account setCurrency(java.lang.String currency) {
    this.currency = currency;
    return this;
  }

  public void unsetCurrency() {
    this.currency = null;
  }

  /** Returns true if field currency is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrency() {
    return this.currency != null;
  }

  public void setCurrencyIsSet(boolean value) {
    if (!value) {
      this.currency = null;
    }
  }

  /**
   * 
   * @see AccountType
   */
  public AccountType getType() {
    return this.type;
  }

  /**
   * 
   * @see AccountType
   */
  public Account setType(AccountType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public java.lang.String getGuid() {
    return this.guid;
  }

  public Account setGuid(java.lang.String guid) {
    this.guid = guid;
    return this;
  }

  public void unsetGuid() {
    this.guid = null;
  }

  /** Returns true if field guid is set (has been assigned a value) and false otherwise */
  public boolean isSetGuid() {
    return this.guid != null;
  }

  public void setGuidIsSet(boolean value) {
    if (!value) {
      this.guid = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case SURNAME:
      if (value == null) {
        unsetSurname();
      } else {
        setSurname((java.lang.String)value);
      }
      break;

    case PESEL:
      if (value == null) {
        unsetPesel();
      } else {
        setPesel((java.lang.String)value);
      }
      break;

    case INCOME:
      if (value == null) {
        unsetIncome();
      } else {
        setIncome((java.lang.Double)value);
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((java.lang.Double)value);
      }
      break;

    case CURRENCY:
      if (value == null) {
        unsetCurrency();
      } else {
        setCurrency((java.lang.String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((AccountType)value);
      }
      break;

    case GUID:
      if (value == null) {
        unsetGuid();
      } else {
        setGuid((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case SURNAME:
      return getSurname();

    case PESEL:
      return getPesel();

    case INCOME:
      return getIncome();

    case AMOUNT:
      return getAmount();

    case CURRENCY:
      return getCurrency();

    case TYPE:
      return getType();

    case GUID:
      return getGuid();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case SURNAME:
      return isSetSurname();
    case PESEL:
      return isSetPesel();
    case INCOME:
      return isSetIncome();
    case AMOUNT:
      return isSetAmount();
    case CURRENCY:
      return isSetCurrency();
    case TYPE:
      return isSetType();
    case GUID:
      return isSetGuid();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Account)
      return this.equals((Account)that);
    return false;
  }

  public boolean equals(Account that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_surname = true && this.isSetSurname();
    boolean that_present_surname = true && that.isSetSurname();
    if (this_present_surname || that_present_surname) {
      if (!(this_present_surname && that_present_surname))
        return false;
      if (!this.surname.equals(that.surname))
        return false;
    }

    boolean this_present_pesel = true && this.isSetPesel();
    boolean that_present_pesel = true && that.isSetPesel();
    if (this_present_pesel || that_present_pesel) {
      if (!(this_present_pesel && that_present_pesel))
        return false;
      if (!this.pesel.equals(that.pesel))
        return false;
    }

    boolean this_present_income = true;
    boolean that_present_income = true;
    if (this_present_income || that_present_income) {
      if (!(this_present_income && that_present_income))
        return false;
      if (this.income != that.income)
        return false;
    }

    boolean this_present_amount = true;
    boolean that_present_amount = true;
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (this.amount != that.amount)
        return false;
    }

    boolean this_present_currency = true && this.isSetCurrency();
    boolean that_present_currency = true && that.isSetCurrency();
    if (this_present_currency || that_present_currency) {
      if (!(this_present_currency && that_present_currency))
        return false;
      if (!this.currency.equals(that.currency))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_guid = true && this.isSetGuid();
    boolean that_present_guid = true && that.isSetGuid();
    if (this_present_guid || that_present_guid) {
      if (!(this_present_guid && that_present_guid))
        return false;
      if (!this.guid.equals(that.guid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetSurname()) ? 131071 : 524287);
    if (isSetSurname())
      hashCode = hashCode * 8191 + surname.hashCode();

    hashCode = hashCode * 8191 + ((isSetPesel()) ? 131071 : 524287);
    if (isSetPesel())
      hashCode = hashCode * 8191 + pesel.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(income);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(amount);

    hashCode = hashCode * 8191 + ((isSetCurrency()) ? 131071 : 524287);
    if (isSetCurrency())
      hashCode = hashCode * 8191 + currency.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetGuid()) ? 131071 : 524287);
    if (isSetGuid())
      hashCode = hashCode * 8191 + guid.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Account other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSurname()).compareTo(other.isSetSurname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSurname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.surname, other.surname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPesel()).compareTo(other.isSetPesel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPesel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pesel, other.pesel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIncome()).compareTo(other.isSetIncome());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncome()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.income, other.income);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAmount()).compareTo(other.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, other.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCurrency()).compareTo(other.isSetCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currency, other.currency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGuid()).compareTo(other.isSetGuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.guid, other.guid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Account(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("surname:");
    if (this.surname == null) {
      sb.append("null");
    } else {
      sb.append(this.surname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pesel:");
    if (this.pesel == null) {
      sb.append("null");
    } else {
      sb.append(this.pesel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("income:");
    sb.append(this.income);
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    sb.append(this.amount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("currency:");
    if (this.currency == null) {
      sb.append("null");
    } else {
      sb.append(this.currency);
    }
    first = false;
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetGuid()) {
      if (!first) sb.append(", ");
      sb.append("guid:");
      if (this.guid == null) {
        sb.append("null");
      } else {
        sb.append(this.guid);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AccountStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AccountStandardScheme getScheme() {
      return new AccountStandardScheme();
    }
  }

  private static class AccountStandardScheme extends org.apache.thrift.scheme.StandardScheme<Account> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Account struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SURNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.surname = iprot.readString();
              struct.setSurnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PESEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pesel = iprot.readString();
              struct.setPeselIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INCOME
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.income = iprot.readDouble();
              struct.setIncomeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.amount = iprot.readDouble();
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currency = iprot.readString();
              struct.setCurrencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = sr.rpc.bank.AccountType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // GUID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.guid = iprot.readString();
              struct.setGuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Account struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.surname != null) {
        oprot.writeFieldBegin(SURNAME_FIELD_DESC);
        oprot.writeString(struct.surname);
        oprot.writeFieldEnd();
      }
      if (struct.pesel != null) {
        oprot.writeFieldBegin(PESEL_FIELD_DESC);
        oprot.writeString(struct.pesel);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INCOME_FIELD_DESC);
      oprot.writeDouble(struct.income);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
      oprot.writeDouble(struct.amount);
      oprot.writeFieldEnd();
      if (struct.currency != null) {
        oprot.writeFieldBegin(CURRENCY_FIELD_DESC);
        oprot.writeString(struct.currency);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.guid != null) {
        if (struct.isSetGuid()) {
          oprot.writeFieldBegin(GUID_FIELD_DESC);
          oprot.writeString(struct.guid);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AccountTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AccountTupleScheme getScheme() {
      return new AccountTupleScheme();
    }
  }

  private static class AccountTupleScheme extends org.apache.thrift.scheme.TupleScheme<Account> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Account struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetSurname()) {
        optionals.set(1);
      }
      if (struct.isSetPesel()) {
        optionals.set(2);
      }
      if (struct.isSetIncome()) {
        optionals.set(3);
      }
      if (struct.isSetAmount()) {
        optionals.set(4);
      }
      if (struct.isSetCurrency()) {
        optionals.set(5);
      }
      if (struct.isSetType()) {
        optionals.set(6);
      }
      if (struct.isSetGuid()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetSurname()) {
        oprot.writeString(struct.surname);
      }
      if (struct.isSetPesel()) {
        oprot.writeString(struct.pesel);
      }
      if (struct.isSetIncome()) {
        oprot.writeDouble(struct.income);
      }
      if (struct.isSetAmount()) {
        oprot.writeDouble(struct.amount);
      }
      if (struct.isSetCurrency()) {
        oprot.writeString(struct.currency);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetGuid()) {
        oprot.writeString(struct.guid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Account struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.surname = iprot.readString();
        struct.setSurnameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.pesel = iprot.readString();
        struct.setPeselIsSet(true);
      }
      if (incoming.get(3)) {
        struct.income = iprot.readDouble();
        struct.setIncomeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.amount = iprot.readDouble();
        struct.setAmountIsSet(true);
      }
      if (incoming.get(5)) {
        struct.currency = iprot.readString();
        struct.setCurrencyIsSet(true);
      }
      if (incoming.get(6)) {
        struct.type = sr.rpc.bank.AccountType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.guid = iprot.readString();
        struct.setGuidIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


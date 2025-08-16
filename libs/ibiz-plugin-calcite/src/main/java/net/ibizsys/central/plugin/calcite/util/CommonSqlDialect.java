package net.ibizsys.central.plugin.calcite.util;

import org.apache.calcite.rel.type.RelDataTypeSystem;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlDialect;
import org.apache.calcite.sql.SqlIntervalLiteral;
import org.apache.calcite.sql.SqlIntervalQualifier;
import org.apache.calcite.sql.SqlWriter;

public class CommonSqlDialect extends SqlDialect {

	public static final SqlDialect.Context DEFAULT_CONTEXT = SqlDialect.EMPTY_CONTEXT.withDatabaseProduct(SqlDialect.DatabaseProduct.DB2);

	public static final SqlDialect DEFAULT = new CommonSqlDialect(DEFAULT_CONTEXT);

	/** Creates a Db2SqlDialect. */
	public CommonSqlDialect(Context context) {
		super(context);
	}

	@Override
	public boolean supportsCharSet() {
		return false;
	}

	@Override
	public boolean hasImplicitTableAlias() {
		return false;
	}

	@Override
	public void unparseSqlIntervalQualifier(SqlWriter writer, SqlIntervalQualifier qualifier, RelDataTypeSystem typeSystem) {

		// DB2 supported qualifiers. Singular form of these keywords are also
		// acceptable.
		// YEAR/YEARS
		// MONTH/MONTHS
		// DAY/DAYS
		// HOUR/HOURS
		// MINUTE/MINUTES
		// SECOND/SECONDS

		switch (qualifier.timeUnitRange) {
		case YEAR:
		case MONTH:
		case DAY:
		case HOUR:
		case MINUTE:
		case SECOND:
		case MICROSECOND:
		case QUARTER:
			final String timeUnit = qualifier.timeUnitRange.startUnit.name();
			writer.keyword(timeUnit);
			break;
		default:
			throw new AssertionError("Unsupported type: " + qualifier.timeUnitRange);
		}

		if (null != qualifier.timeUnitRange.endUnit) {
			throw new AssertionError("Unsupported end unit: " + qualifier.timeUnitRange.endUnit);
		}
	}

	@Override
	public void unparseSqlIntervalLiteral(SqlWriter writer, SqlIntervalLiteral literal, int leftPrec, int rightPrec) {
		// A duration is a positive or negative number representing an interval
		// of time.
		// If one operand is a date, the other labeled duration of YEARS,
		// MONTHS, or DAYS.
		// If one operand is a time, the other must be labeled duration of
		// HOURS, MINUTES, or SECONDS.
		// If one operand is a timestamp, the other operand can be any of teh
		// duration.

		SqlIntervalLiteral.IntervalValue interval = literal.getValueAs(SqlIntervalLiteral.IntervalValue.class);
		if (interval.getSign() == -1) {
			writer.print("-");
		}
		writer.literal(interval.getIntervalLiteral());
		unparseSqlIntervalQualifier(writer, interval.getIntervalQualifier(), RelDataTypeSystem.DEFAULT);
	}

	
	@Override
	public void unparseCall(SqlWriter writer, SqlCall call, int leftPrec, int rightPrec) {
		
		super.unparseCall(writer, call, leftPrec, rightPrec);
	}
}

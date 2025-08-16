package net.ibizsys.central.util;

import org.springframework.data.domain.Sort;

/**
 * 导出时手动设定偏移
 */
public class PageRequest extends org.springframework.data.domain.PageRequest {

    private long offset;

    public void setOffset(long offset) {
        this.offset = offset;
    }

    @Override
    public long getOffset() {
        if (offset == 0)
            return super.getOffset();
        return this.offset;
    }

    protected PageRequest(int page, int size, Sort sort) {
        super(page, size, sort);
    }

    protected PageRequest(int page, int size, long offset, Sort sort) {
        super(page, size, sort);
        this.offset = offset;
    }

    public static PageRequest of(int page, int size) {
        return of(page, size, Sort.unsorted());
    }

    public static PageRequest of(int page, int size, long offset) {
        return of(page, size, offset, Sort.unsorted());
    }

    public static PageRequest of(int page, int size, Sort sort) {
        return new PageRequest(page, size, sort);
    }

    public static PageRequest of(int page, int size, long offset, Sort sort) {
        return new PageRequest(page, size, offset, sort);
    }

    public static PageRequest of(int page, int size, Sort.Direction direction, String... properties) {
        return new PageRequest(page, size, Sort.by(direction, properties));
    }

    public static PageRequest of(int page, int size, long offset, Sort.Direction direction, String... properties) {
        return new PageRequest(page, size, offset, Sort.by(direction, properties));
    }

}

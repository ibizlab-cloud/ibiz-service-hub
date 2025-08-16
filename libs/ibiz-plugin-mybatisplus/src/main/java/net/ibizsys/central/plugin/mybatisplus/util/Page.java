package net.ibizsys.central.plugin.mybatisplus.util;

public class Page<T> extends com.baomidou.mybatisplus.extension.plugins.pagination.Page<T> {

    private long offset = 0;

    @Override
    public long offset() {
        if (offset == 0)
            return super.offset();
        return offset;
    }

    public void offset(long offset) {
        this.offset = offset;
    }
}

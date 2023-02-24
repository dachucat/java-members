package course.linkflower.link.oneframework.members.dto.book;

import lombok.Data;

@Data
public class AddBookByBarcodeDto {
    //书的出厂二维码
    private String bookInforBarcode;
    //图书馆给书的贴签二维码
    private String bookBarcode;
    private String bookshelfBarcode;
}

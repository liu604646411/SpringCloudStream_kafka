package com.springcloudstream.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MySource {
    String OUTPUT_ADD = "output_add";

    String OUTPUT_DEL = "output_del";

    String OUTPUT_UPDATE = "output_update";

    @Output(OUTPUT_ADD)
    MessageChannel outputAdd();

    @Output(OUTPUT_DEL)
    MessageChannel outputDel();

    @Output(OUTPUT_UPDATE)
    MessageChannel outputUpdate();
}

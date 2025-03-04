/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.hmrcemailrenderer.templates.paye

import org.scalatestplus.play.PlaySpec
import uk.gov.hmrc.hmrcemailrenderer.domain.{ MessagePriority, MessageTemplate }
import uk.gov.hmrc.hmrcemailrenderer.templates.CommonParamsForSpec
import uk.gov.hmrc.hmrcemailrenderer.templates.ServiceIdentifier.SelfAssessment

class NewMessageAlert_P800Spec extends PlaySpec with CommonParamsForSpec {

  "NewMessageAlert_P800" must {

    val newMessageAlert: MessageTemplate = MessageTemplate.create(
      templateId = "newMessageAlert_P800",
      fromAddress = "HMRC@tax.service.gov.uk",
      service = SelfAssessment,
      subject = "You have a new message from HMRC",
      plainTemplate = txt.newMessageAlert_P800.f,
      htmlTemplate = html.newMessageAlert_P800.f,
      priority = Some(MessagePriority.Standard)
    )

    "include correct subject" in {
      newMessageAlert.subject(commonParameters) mustBe "You have a new message from HMRC"
    }

    "include htmlTemplate body and footer" in {
      val htmlContent = newMessageAlert
        .htmlTemplate(commonParameters ++ Map("recipientName_surname" -> "John", "recipientName_title" -> "Mrs"))
        .toString
      htmlContent must include("You have a new letter online")
      htmlContent must include("Dear")
      htmlContent must include("Mrs John")
      htmlContent must include(
        "We have just published your new income tax calculation letter to your secure online personal tax account.")
      htmlContent must include(
        "Details in the letter will tell you how to pay HMRC or claim back any funds we may owe you.")
      htmlContent must include(
        "If you are due a refund, claiming online will mean you can have funds transferred directly to you within 5 working days.")
      htmlContent must include("How to read your online letter")
      htmlContent must include(
        "To keep your personal information safe, we do not put a link to your online account in our emails to you.")
      htmlContent must include(
        "Please log in now to HMRC online and go to your messages to read your full income tax calculation letter. Do this using your Government Gateway password and ID.")
      htmlContent must include("If you&#8217;re unsure an email is from HMRC:")
      htmlContent must include("Do not reply to it or click on any links")
      htmlContent must include(
        "Report the suspicious email to HMRC - to find out how, go to GOV.UK and search for 'Avoid and report internet scams and phishing'")
    }
  }

  "NewMessageAlert_P800_cy welsh template" must {

    val newMessageAlert: MessageTemplate = MessageTemplate.create(
      templateId = "newMessageAlert_P800_cy",
      fromAddress = "HMRC@tax.service.gov.uk",
      service = SelfAssessment,
      subject = "Mae gennych neges newydd oddi wrth CThEM",
      plainTemplate = txt.newMessageAlert_P800_cy.f,
      htmlTemplate = html.newMessageAlert_P800_cy.f,
      priority = Some(MessagePriority.Standard)
    )

    "include correct subject" in {
      newMessageAlert.subject(commonParameters) mustBe "Mae gennych neges newydd oddi wrth CThEM"
    }

    "include htmlTemplate body and footer" in {
      val htmlContent = newMessageAlert
        .htmlTemplate(commonParameters ++ Map("recipientName_surname" -> "John", "recipientName_title" -> "Mrs"))
        .toString
      htmlContent must include("Mae’ch cyfrifiad treth newydd yn barod")
      htmlContent must include("Annwyl")
      htmlContent must include("Mrs John")
      htmlContent must include("Mae’ch cyfrifiad treth diweddaraf nawr yn barod i chi fwrw golwg drosto ar-lein.")
      htmlContent must include(
        "Mewngofnodwch i CThEM ar-lein gyda’ch Dynodydd Defnyddiwr (ID) a’ch cyfrinair ar gyfer Porth y Llywodraeth, ac ewch i’ch negeseuon. Neu lawrlwythwch ap CThEM sy’n rhad ac am ddim.")
      htmlContent must include("Am resymau diogelwch, nid ydym wedi cynnwys cysylltiad gyda’r e-bost hwn.")
      htmlContent must include("Pam y cawsoch yr e-bost hwn")
      htmlContent must include("Gwnaethoch ddewis cael llythyrau treth ar-lein yn lle llythyrau drwy’r post.")
      htmlContent must include(
        "Mae hyn yn golygu ein bod yn anfon e-bost atoch er mwyn rhoi gwybod i chi pan fydd gennych neges newydd.")
      htmlContent must include("Oddi wrth adran TWE CThEM")
      htmlContent must include("If you&#8217;re unsure an email is from HMRC:")
      htmlContent must include("Do not reply to it or click on any links")
      htmlContent must include(
        "Report the suspicious email to HMRC - to find out how, go to GOV.UK and search for 'Avoid and report internet scams and phishing'")
    }
  }

  "NewMessageAlert_P800_D2" must {

    val newMessageAlert: MessageTemplate = MessageTemplate.create(
      templateId = "newMessageAlert_P800_D2",
      fromAddress = "HMRC@tax.service.gov.uk",
      service = SelfAssessment,
      subject = "You have a new message from HMRC",
      plainTemplate = txt.newMessageAlert_P800.f,
      htmlTemplate = html.newMessageAlert_P800.f,
      priority = Some(MessagePriority.Standard)
    )

    "include correct subject" in {
      newMessageAlert.subject(commonParameters) mustBe "You have a new message from HMRC"
    }

    "include htmlTemplate body and footer" in {
      val htmlContent = newMessageAlert
        .htmlTemplate(commonParameters ++ Map("recipientName_surname" -> "John", "recipientName_title" -> "Mrs"))
        .toString
      htmlContent must include("You have a new letter online")
      htmlContent must include("Dear")
      htmlContent must include("Mrs John")
      htmlContent must include(
        "We have just published your new income tax calculation letter to your secure online personal tax account.")
      htmlContent must include(
        "Details in the letter will tell you how to pay HMRC or claim back any funds we may owe you.")
      htmlContent must include(
        "If you are due a refund, claiming online will mean you can have funds transferred directly to you within 5 working days.")
      htmlContent must include("How to read your online letter")
      htmlContent must include(
        "To keep your personal information safe, we do not put a link to your online account in our emails to you.")
      htmlContent must include(
        "Please log in now to HMRC online and go to your messages to read your full income tax calculation letter. Do this using your Government Gateway password and ID.")
      htmlContent must include("If you&#8217;re unsure an email is from HMRC:")
      htmlContent must include("Do not reply to it or click on any links")
      htmlContent must include(
        "Report the suspicious email to HMRC - to find out how, go to GOV.UK and search for 'Avoid and report internet scams and phishing'")
    }
  }

  "NewMessageAlert_P800_D2_cy welsh template" must {

    val newMessageAlert: MessageTemplate = MessageTemplate.create(
      templateId = "newMessageAlert_P800_D2_cy",
      fromAddress = "HMRC@tax.service.gov.uk",
      service = SelfAssessment,
      subject = "Mae gennych neges newydd oddi wrth CThEM",
      plainTemplate = txt.newMessageAlert_P800_cy.f,
      htmlTemplate = html.newMessageAlert_P800_cy.f,
      priority = Some(MessagePriority.Standard)
    )

    "include correct subject" in {
      newMessageAlert.subject(commonParameters) mustBe "Mae gennych neges newydd oddi wrth CThEM"
    }

    "include htmlTemplate body and footer" in {
      val htmlContent = newMessageAlert
        .htmlTemplate(commonParameters ++ Map("recipientName_surname" -> "John", "recipientName_title" -> "Mrs"))
        .toString
      htmlContent must include("Mae’ch cyfrifiad treth newydd yn barod")
      htmlContent must include("Annwyl")
      htmlContent must include("Mrs John")
      htmlContent must include("Mae’ch cyfrifiad treth diweddaraf nawr yn barod i chi fwrw golwg drosto ar-lein.")
      htmlContent must include(
        "Mewngofnodwch i CThEM ar-lein gyda’ch Dynodydd Defnyddiwr (ID) a’ch cyfrinair ar gyfer Porth y Llywodraeth, ac ewch i’ch negeseuon. Neu lawrlwythwch ap CThEM sy’n rhad ac am ddim.")
      htmlContent must include("Am resymau diogelwch, nid ydym wedi cynnwys cysylltiad gyda’r e-bost hwn.")
      htmlContent must include("Pam y cawsoch yr e-bost hwn")
      htmlContent must include("Gwnaethoch ddewis cael llythyrau treth ar-lein yn lle llythyrau drwy’r post.")
      htmlContent must include(
        "Mae hyn yn golygu ein bod yn anfon e-bost atoch er mwyn rhoi gwybod i chi pan fydd gennych neges newydd.")
      htmlContent must include("Oddi wrth adran TWE CThEM")
      htmlContent must include("If you&#8217;re unsure an email is from HMRC:")
      htmlContent must include("Do not reply to it or click on any links")
      htmlContent must include(
        "Report the suspicious email to HMRC - to find out how, go to GOV.UK and search for 'Avoid and report internet scams and phishing'")
    }
  }

}
